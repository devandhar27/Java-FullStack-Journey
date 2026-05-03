package com.Dev.encapsulation;

public class Teacher {
	public static void main(String[] args) {
		Student s=new Student(110);
		s.setStudentAttendence(true);
		s.getStudentAttendence();
		s.setName("Dev");
		s.getName();
	}
}
