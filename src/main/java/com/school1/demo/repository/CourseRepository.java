package com.school1.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.school1.demo.model.Course;

public interface CourseRepository extends JpaRepository<Course, Long>{

}
