package com.cjc.main.serviceimpl;


import java.util.Optional;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.main.model.Student;
import com.cjc.main.repository.StudentRepository;
import com.cjc.main.servicei.StudentServiceI;

@Service
public class StudentServiceImpl implements StudentServiceI {

	@Autowired
	private StudentRepository reposiroty;

	@Override
	public String deleteStudentByRollno(int studentRollNumber) {

		reposiroty.deleteById(studentRollNumber);
		return "successfully deleted";
	}

	@Override

	public Student getStudentDetails(int studentRollNumber) {
		
		return reposiroty.findById(studentRollNumber).get();
		
	}
		
		
	

     public Student saveStudentData(Student student) {
		
		return reposiroty.save(student);
	}

	public List<Student> getAllStudent() {
		
		return reposiroty.findAll();

	}

}
