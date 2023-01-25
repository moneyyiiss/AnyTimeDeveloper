package com.crudoperation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crudoperation.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
	
}
