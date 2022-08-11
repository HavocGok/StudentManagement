package com.jpa.StudentManagement.service;

import java.util.List;

import com.jpa.StudentManagement.Dao.StudentManagementDao;
import com.jpa.StudentManagement.entity.Student;

public class StudentManagementService {
	private StudentManagementDao sdao=new StudentManagementDao();
	
	
	public String addStudent(Student s)
	{
		return sdao.insertStudentDetails(s);
	}
	
	public Student viewStudent(int enrollNo)
	{
		return sdao.getStudent(enrollNo);
	}
	
	public List<Student> viewAllStudent()
	{
		return sdao.getAll();
	}
	
	public String updateStudent(int enrollNo,String property,String value)
	{
		return sdao.updateStudentDetails(enrollNo, property, value);
	}
	
	public String deleteStudent(int enrollNo) {
		return sdao.deleteStudent(enrollNo);
	}
}
