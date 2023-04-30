package com.school1.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.school1.demo.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
