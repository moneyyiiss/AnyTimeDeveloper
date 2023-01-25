package com.crudoperation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crudoperation.entity.Student;
import com.crudoperation.repository.StudentRepository;

@Service
public class StudentService {
	@Autowired
	private StudentRepository repository;
	
	//save single student
	public Student saveStudent(Student student) {
		return repository.save(student);
	}
	
	//save multiple student
	public List<Student>  saveStudents(List<Student> students) {
		return repository.saveAll(students);
	}
	
	//get all students
	public List<Student>  getStudents() {
		return repository.findAll();
	}
	
	//get student by id
	public Student getStudentById(int id) {
		return repository.findById(id).orElse(null);
		
	}
	
	//delete student by id
	public String deleteStudent(int id) {
		repository.deleteById(id);
		return "Student has been deleted !!" + id;
	}
	
	//update student
	public Student updateStudent(Student student) {
		Student existStudent = repository.findById(student.getId()).orElse(null);
		existStudent.setName(student.getName());
		existStudent.setMobile(student.getMobile());
		existStudent.setFathername(student.getFathername());
		existStudent.setMothername(student.getMothername());
		return repository.save(existStudent);
	}
	
}
