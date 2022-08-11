package com.jpa.StudentManagement.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jpa.StudentManagement.entity.Student;

public class StudentManagementDao {
	private EntityManagerFactory emf;
	private EntityManager em;
	
	public StudentManagementDao() {
		emf = Persistence.createEntityManagerFactory("StudentManagement");
		em = emf.createEntityManager();
	}
	
	/*public void createTable() {
		try {
			st = con.createStatement();
			String sql = "create table Student(enrollNo int primary key,studentName varchar(50), mobileNo varchar(15),dept varchar(30)";
			st.execute(sql);
		} catch (SQLException e) {
			System.out.println("DATABASE ERROR..." + e);
		}
	}*/

	public String insertStudentDetails(Student s) {
		em.getTransaction().begin();
		em.persist(s);
		em.getTransaction().commit();
		return "Student data inserted successfully";
	}

	public Student getStudent(int enrollNo) {
		em.getTransaction().begin();
		Student s = em.find(Student.class,enrollNo);
		em.getTransaction().commit();
		return s;
	}

	/*public void viewAllStudent() {
		em.getTransaction().begin();
		Student s = em.(Student.class,enrollNo);
		em.getTransaction().commit();
		return s;
	}*/

	public String updateStudentDetails(int enrollNo, String property, String value) {
		
		em.getTransaction().begin();
		Student s = em.find(Student.class,enrollNo);
		if(property.equalsIgnoreCase("studentName"))
		{
			s.setStudentName(value);
		}
		else if(property.equalsIgnoreCase("mobileNo"))
		{
			s.setMobileNo(value);
		}
		else if(property.equalsIgnoreCase("dept"))
		{
			s.setDept(value);
		}
		em.getTransaction().commit();
	    return "Student data updated successfully";
	}


	public String deleteStudent(int enrollNo) {
		em.getTransaction().begin();
		Student s = em.find(Student.class,enrollNo);
		em.remove(s);
		em.getTransaction().commit();
		return "Student deleted successfully";
	}

	public List<Student> getAll()
	{
		em.getTransaction().begin();
		Query q = em.createNamedQuery("viewAllStudent");
		List<Student> slist = q.getResultList();
		em.getTransaction().commit();
		return slist;
	}
}
	


