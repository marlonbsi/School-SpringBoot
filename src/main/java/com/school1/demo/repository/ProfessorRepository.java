package com.school1.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.school1.demo.model.Professor;

public interface ProfessorRepository extends JpaRepository<Professor, Long>{

}
