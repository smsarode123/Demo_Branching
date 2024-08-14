package com.cjc.main.servicei;




import java.util.List;



import com.cjc.main.model.Student;

public interface StudentServiceI {

	Student getStudentDetails(int studentRollNumber);


	Student saveStudentData(Student student);

	List<Student> getAllStudent();


}
