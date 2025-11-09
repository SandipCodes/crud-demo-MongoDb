package com.brainbeast.cruddemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.brainbeast.cruddemo.model.Student;
import com.brainbeast.cruddemo.repository.StudentRepository;

@RestController
@RequestMapping("/students")
public class StudentController {

	@Autowired
	private StudentRepository repository;
	
	@PostMapping
	public Student createStudent(@RequestBody Student student){
		return repository.save(student);
	}
	
	@GetMapping
	public List<Student> getAll() {
		return repository.findAll();
	}
}
