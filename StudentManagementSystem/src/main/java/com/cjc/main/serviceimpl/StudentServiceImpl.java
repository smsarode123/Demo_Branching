package com.cjc.main.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.main.model.Student;
import com.cjc.main.repository.StudentRepository;
import com.cjc.main.servicei.StudentServiceI;

@Service
public class StudentServiceImpl implements StudentServiceI{
	
	@Autowired private StudentRepository reposiroty;

	@Override
	public Student getSingleStudent(String studentName) {
		
		return reposiroty.findByStudentName(studentName);
	}

}
