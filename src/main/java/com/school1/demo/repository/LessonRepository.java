package com.school1.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.school1.demo.model.Lesson;

public interface LessonRepository extends JpaRepository<Lesson, Long>{

}
