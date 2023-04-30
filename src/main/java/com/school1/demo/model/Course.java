package com.school1.demo.model;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="courses")
public class Course {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "name", nullable = false)
	private String name;
	
	@Column(name = "field", nullable = false)
	private String field;
	
	@Column(name = "year", nullable = false)
	private Integer year;
	
	@OneToMany(mappedBy = "course")
	private Set<Lesson> lessons;
	
	@OneToMany(mappedBy = "course")
	private Set<Student> students;

	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", field=" + field + ", year=" + year + "]";
	}
	
	

}
