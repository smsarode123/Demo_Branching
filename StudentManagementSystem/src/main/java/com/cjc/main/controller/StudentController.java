package com.cjc.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.main.model.Student;
import com.cjc.main.servicei.StudentServiceI;

@RestController
public class StudentController {
	
	
	@Autowired private StudentServiceI ssi;
	
	@PostMapping("/saveStudentData")
	public ResponseEntity<Student> saveStudent(@RequestBody Student student)
	{
		Student stu=ssi.saveStudentData(student);
		
		return new ResponseEntity<Student>(stu, HttpStatus.OK);
		
		
	}

	
	@GetMapping("/getAllStudent")
	public ResponseEntity<List<Student>> getAllStudent(){
		
		List<Student> students = ssi.getAllStudent();
		
		return new ResponseEntity<List<Student>>(students,HttpStatus.OK);
		
	}
}
