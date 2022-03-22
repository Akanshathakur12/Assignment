package com.assignment.cg;

public class Employee {
	
	String EmpId;
	String EmpName;
	String EmpDept;
	double EmpPhone;
	double BaseSal;
	
	//Default constuctor
	 Employee() {
		}
	
	 // constructor with object as parameter
	 Employee(Object o){
		
			 this.EmpId=EmpId;
			 this.EmpName=EmpName;
			 this.EmpDept=EmpDept;
			 this.EmpPhone=EmpPhone;
			 this.BaseSal=BaseSal;
		 }
	 
	 
	
	public String getEmpId() {
		return EmpId;
	}

	public void setEmpId(String empId) {
		EmpId = empId;
	}

	public String getEmpName() {
		return EmpName;
	}

	public void setEmpName(String empName) {
		EmpName = empName;
	}

	public String getEmpDept() {
		return EmpDept;
	}

	public void setEmpDept(String empDept) {
		EmpDept = empDept;
	}

	public double getEmpPhone() {
		return EmpPhone;
	}

	public void setEmpPhone(double empPhone) {
		EmpPhone = empPhone;
	}

	public double getBaseSal() {
		return BaseSal;
	}

	public void setBaseSal(double baseSal) {
		BaseSal = baseSal;
	}
	
	
	
	
	public double Calculate() {
		 
		return (BaseSal*0.12);
		
	}
	public double allowance() {
		double rentallowance=2000;
	 double travelallowance=3000;
	 double bonus=1000;
	return rentallowance+travelallowance+bonus ;
		
	}

}
