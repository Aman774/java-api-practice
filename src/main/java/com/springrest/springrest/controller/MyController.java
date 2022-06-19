package com.springrest.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.Course;
import com.springrest.springrest.services.CourseService;

@RestController
public class MyController {

	@Autowired
	private CourseService courseService;

	@GetMapping("/home")
	public String home() {

		System.out.println("Hello Home page testing");
		return "Hello Home";
	}

	@GetMapping("/courses")
	public List<Course> getCourse() {

		System.out.println("*****************check...************************");

		return this.courseService.getCourse();

	}

	@GetMapping("/course/{courseId}")
	public Course getCourseById(@PathVariable String courseId) {

		return courseService.getCourseById(Long.parseLong(courseId));

	}
	
	@PostMapping("/add/course")
	public Course addCourse(@RequestBody Course course) {
		
		
		return this.courseService.addCourse(course);
	}
	
	

}
