package com.manu.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.manu.model.Student;

@Controller
@RequestMapping(value = "/Student")
public class StudentContoller {
	
	ConcurrentMap<Integer, Student> students = new ConcurrentHashMap<>();
	
	@PostMapping(value = "/")
	public Student addStudent(@RequestBody Student student) {
		students.put(student.getId(), student);
		return student;
	}
	
	@GetMapping(value = "/")
	public List<Student> listStudents() {
		return new ArrayList<Student>(students.values());
	}
	
	@GetMapping(value = "/{id}")
	public Student getStudent(@PathVariable Integer id) {
		return students.get(id);
	}
}
