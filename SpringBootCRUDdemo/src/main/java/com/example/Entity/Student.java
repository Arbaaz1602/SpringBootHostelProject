package com.example.Entity;

public class Student {
	
	private int studentId;
	private String fName;
	private String lname;
	private String city;
	private String phoneNo;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int studentId, String fName, String lname, String city, String phoneNo) {
		super();
		this.studentId = studentId;
		this.fName = fName;
		this.lname = lname;
		this.city = city;
		this.phoneNo = phoneNo;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", fName=" + fName + ", lname=" + lname + ", city=" + city
				+ ", phoneNo=" + phoneNo + "]";
	}
	
	

}
