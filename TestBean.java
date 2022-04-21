package com.binde.spring;

public class TestBean implements Test{

	private Employee employee;
	
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public Employee display() {
		System.out.println(employee);
		System.out.println("Return Value Main Method");
		return employee;
	}

}
