package com.cjc.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.main.model.Student;
import com.cjc.main.servicei.StudentServiceI;

@RestController
public class StudentController {
	
	
	@Autowired private StudentServiceI ssi;

	@GetMapping("/getStudent-Details-ById/{studentRollNumber}")
	public ResponseEntity<Student> getStudentDatails(@PathVariable int studentRollNumber)
	{
		Student student=ssi.getStudentDetails(studentRollNumber);
		return new ResponseEntity<>(student, HttpStatus.FOUND);
	}
}
