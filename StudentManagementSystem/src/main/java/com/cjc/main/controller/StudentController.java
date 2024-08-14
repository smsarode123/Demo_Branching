package com.cjc.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.main.model.Student;
import com.cjc.main.servicei.StudentServiceI;

@RestController
public class StudentController {
	
	
	@Autowired private StudentServiceI ssi;
	
	
	@PutMapping("/updateDetail/{studentRollNumber}")
	public ResponseEntity<Student> updatedetail(@RequestBody Student stu,@PathVariable int studentRollNumber )
	{
		Student student=ssi.updatedetail(studentRollNumber, stu);
		ResponseEntity<Student> restu=new ResponseEntity<Student>(student,HttpStatus.OK);
		return restu;
	}
	

}
