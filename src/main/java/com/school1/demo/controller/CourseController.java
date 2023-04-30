package com.school1.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.school1.demo.model.Course;
import com.school1.demo.service.CourseService;

@RestController
@RequestMapping("/api/courses")
public class CourseController {
	
	private CourseService courseService;

	public CourseController(CourseService courseService) {
		super();
		this.courseService = courseService;
	}
	
//	Build create new course REST API
	@PostMapping()
	public ResponseEntity<Course> saveCourse(@RequestBody Course course){
		return new ResponseEntity<Course>(courseService.saveCourse(course), HttpStatus.CREATED);
	}

}
