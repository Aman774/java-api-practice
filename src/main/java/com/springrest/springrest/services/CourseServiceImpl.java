package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.springrest.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {

	List<Course> list;

	CourseServiceImpl() {

		list = new ArrayList<>();

		list.add(new Course(145, "course1", "desc1"));
		list.add(new Course(146, "course2", "desc2"));

	}

	@Override
	public List<Course> getCourse() {
		// TODO Auto-generated method stub

		for (Course i : list) {
			System.out.println("list ----" + i.getId());
		}

		return list;
	}

	@Override
	public Course getCourseById(long courseId) {
		// TODO Auto-generated method stub

		Course c = null;

		for (Course course : list) {

			if (course.getId() == courseId) {

				c = course;
				break;
			}

		}

		return c;
	}

	@Override
	public Course addCourse(Course course) {
		// TODO Auto-generated method stub

		list.add(course);

		return course;
	}

}
