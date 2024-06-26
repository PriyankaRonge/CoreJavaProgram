package com.pwd;

public class EmployeeC {
	
	public EmployeeC(int id, String name, int salary, int age) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.age = age; 
}
	
	int id;
	String name;
	int salary;
	int age;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	

}
