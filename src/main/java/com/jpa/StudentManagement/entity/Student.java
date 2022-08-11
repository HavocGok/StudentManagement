package com.jpa.StudentManagement.entity;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
@NamedQuery(name = "viewAllStudent", query = "select S from Student S")
@Entity
public class Student {
	@Id
	private int enrollNo;
	private String studentName;
	private String mobileNo;
	private String dept;
	
	public Student() {
		super();
		
	}
	
	public Student(int enrollNo, String studentName, String mobileNo, String dept) {
		super();
		this.enrollNo = enrollNo;
		this.studentName = studentName;
		this.mobileNo = mobileNo;
		this.dept = dept;
	}

	public int getEnrollNo() {
		return enrollNo;
	}

	public void setEnrollNo(int enrollNo) {
		this.enrollNo = enrollNo;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "StudentManagement [enrollNo=" + enrollNo + ", studentName=" + studentName + ", mobileNo=" + mobileNo
				+ ", dept=" + dept + "]";
	}
	
	

}
