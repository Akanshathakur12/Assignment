package com.assignment.cg;

public class Student {
	
	 String studId;
	 String studName;
	 String studDept;
	 String studyear;
	 String studAddress;
	
	
	public Student(String studId, String studName, String studDept, String studyear, String studAddress) {
		this.studId = studId;
		this.studName = studName;
		this.studDept = studDept;
		this.studyear = studyear;
		this.studAddress = studAddress;
	}
	
	public boolean isEqual(Object obj) {
		if(this == obj) {
			return true;
		}
		if(obj instanceof Student) {
			Student stud = (Student) obj;
			return ( (stud.studId.equals(this.studId)) && (stud.studName.equals(this.studName)) && (stud.studDept.equals(this.studDept)) && (stud.studyear.equals(this.studyear)) && (stud.studAddress==this.studAddress) );
		}
		return false;
	}
	
	
	
}
