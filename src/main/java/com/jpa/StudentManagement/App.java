package com.jpa.StudentManagement;

import java.util.Scanner;

import com.jpa.StudentManagement.entity.Student;
import com.jpa.StudentManagement.service.StudentManagementService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("-------->>>>Student Management System<<<<---------");
        System.out.println();
        char ch ='Y';
        Scanner sc = new Scanner(System.in);
        StudentManagementService sm = new StudentManagementService();
        int enrollNo;
        String studentName,mobileNo,dept;
        
        while(ch=='Y') {
        	System.out.println("1. Add Student Details \n2. View Student Details \n3. Update Student Details \n4. Delete Student \n5.View All");
        	int opt = sc.nextInt();
        	switch(opt) {
        	case 1:
        		System.out.println("Add Student Details :");
        		System.out.println();
    			System.out.println("Enter EnrollMent No :-->");
    			enrollNo = sc.nextInt();
    			System.out.println("Enter Student Name :-->");
    			studentName = sc.next();
    			System.out.println("Enter Mobile Number :-->");
    			
    			mobileNo = sc.next();
    			System.out.println("Enter Department :-->");
    			dept = sc.next();
    			Student s = new Student(enrollNo,studentName,mobileNo,dept);
 
    			System.out.println("");
    			System.out.println(sm.addStudent(s));
    			System.out.println();
    			break;
        	case 2:
        		System.out.println("View Student Details :");
        		System.out.println();
        		System.out.println("Enter EnrollmentNo :");
        		enrollNo = sc.nextInt();
        		System.out.println(sm.viewStudent(enrollNo));
        		System.out.println();
        		break;
        	case 3:
        		System.out.println("Update Student Details");
        		System.out.println();
        		System.out.println("Enter EnrollMent No :-->");
    			enrollNo = sc.nextInt();
    			System.out.println("Enter Property Name :-->");
    			String property = sc.next();
    			System.out.println("Enter Property value :-->");
    			String value = sc.next();
    			System.out.println("");
    			System.out.println(sm.updateStudent(enrollNo, property,value));
    			System.out.println();
    			break;
        	case 4:
        		System.out.println("Delete Student");
        		System.out.println();
        		System.out.println("Enter EnrollmentNo :");
        		enrollNo = sc.nextInt();
        		System.out.println(sm.deleteStudent(enrollNo));
        		break;
        	case 5:
        		System.out.println("View all Students");
        		for(Student stud: sm.viewAllStudent() )
        		{
        			System.out.println(stud.getEnrollNo()+" "+stud.getStudentName());
        		}
        		break;
        	default:
        			break;
        	}
        }
    }
}
