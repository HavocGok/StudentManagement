package com.jpa.StudentManagement.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import org.junit.Ignore;
import org.junit.Test;

import com.jpa.StudentManagement.entity.Student;

public class StudentManagementServiceTest {

	private StudentManagementService ssvc = new StudentManagementService();
	
	@Test
	public void testAddStudent() {
		assertEquals("Student data inserted successfully",ssvc.addStudent(new Student(101,"Gokul","9639639632","BCA")));
	}

	@Test
	public void testViewStudent() {
		assertNotNull(ssvc.viewStudent(501));
	}

	@Test
	public void testUpdateStudent() {
		assertEquals("Student data updated successfully",ssvc.updateStudent(501, "studentName", "Pardhi"));
	}

	@Test
	public void testDeleteStudent() {
		assertEquals("Student deleted successfully", ssvc.deleteStudent(222));
	}

}
