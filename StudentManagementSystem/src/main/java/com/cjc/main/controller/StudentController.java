package com.cjc.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.main.servicei.StudentServiceI;

@RestController
public class StudentController {
	
	
	@Autowired private StudentServiceI ssi;

	@DeleteMapping("/deleteByRollno/{studentRollNumber}")
	public ResponseEntity<String> deleteStudentByRollno(@PathVariable int studentRollNumber) {
		
		String student=ssi.deleteStudentByRollno(studentRollNumber);
		
		return new ResponseEntity<String>(student, HttpStatus.GONE);
		
	}
}
