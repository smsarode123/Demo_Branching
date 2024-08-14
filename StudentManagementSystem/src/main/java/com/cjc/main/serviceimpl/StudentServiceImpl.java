package com.cjc.main.serviceimpl;

<<<<<<< HEAD
import java.util.Optional;
=======
import java.util.List;
>>>>>>> refs/heads/main

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.main.model.Student;
import com.cjc.main.repository.StudentRepository;
import com.cjc.main.servicei.StudentServiceI;

@Service
public class StudentServiceImpl implements StudentServiceI{
	
	@Autowired private StudentRepository reposiroty;

	@Override
<<<<<<< HEAD
	public Student getStudentDetails(int studentRollNumber) {
		Optional<Student> option=reposiroty.findById(studentRollNumber);
		
			Student studentRef=option.get();
			return studentRef;
	
=======
     public Student saveStudentData(Student student) {
		
		return reposiroty.save(student);
	}

	public List<Student> getAllStudent() {
		
		return reposiroty.findAll();

>>>>>>> refs/heads/main
	}

}
