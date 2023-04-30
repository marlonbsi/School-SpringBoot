package com.school1.demo.service.impl;

import org.springframework.stereotype.Service;

import com.school1.demo.model.Course;
import com.school1.demo.repository.CourseRepository;
import com.school1.demo.service.CourseService;

@Service
public class CourseServiceImpl implements CourseService{
	
	private CourseRepository courseRepository;

	public CourseServiceImpl(CourseRepository courseRepository) {
		super();
		this.courseRepository = courseRepository;
	}

	@Override
	public Course saveCourse(Course course) {
		return courseRepository.save(course);
	}

}
