package com.Dev.encapsulation;

public class Student {
	private int rollNumber;
	private String name;
	private boolean isAttended;
	
	public Student(int rollNumber) {
		this.rollNumber=rollNumber;
	}
	
	public void setStudentAttendence(boolean flag) {
		if(!isAttended)
			isAttended=flag;
		System.out.println("Teacher assigned attendence to student");
	}
	
	public boolean getStudentAttendence() {
		System.out.println("Teacher accessed student attendence");
		return isAttended;
	}

	public String getName() {
		System.out.println(name);
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
