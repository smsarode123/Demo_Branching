package com.cjc.main.servicei;



import java.util.List;


import com.cjc.main.model.Student;

public interface StudentServiceI {


	Student saveStudentData(Student student);

	List<Student> getAllStudent();


}
