package com.cjc.main.serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.main.model.Student;
import com.cjc.main.repository.StudentRepository;
import com.cjc.main.servicei.StudentServiceI;

@Service
public class StudentServiceImpl implements StudentServiceI{
	
	
	@Autowired private StudentRepository reposiroty;

	@Override
	public Student updatedetail(int studentRollNumber, Student stu) {
		Optional<Student> student =reposiroty.findById(studentRollNumber);
		if(student.isPresent()) 
		{
			Student updatestu = student.get();
			updatestu.setStudentRollNumber(studentRollNumber);
			return reposiroty.save(stu);
			
		}
		return null;
	}

}
