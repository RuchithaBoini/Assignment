package com.src;

public class Employee {
	int id;
	String name;
	int dateofbirth;
	int salary;
	String designation;
	int startdate;
	int enddate;
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
	public int getDateofbirth() {
		return dateofbirth;
	}
	public void setDateofbirth(int dateofbirth) {
		this.dateofbirth = dateofbirth;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getStartdate() {
		return startdate;
	}
	public void setStartdate(int startdate) {
		this.startdate = startdate;
	}
	public int getEnddate() {
		return enddate;
	}
	public void setEnddate(int enddate) {
		this.enddate = enddate;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dateofbirth=" + dateofbirth + ", salary=" + salary
				+ ", designation=" + designation + ", startdate=" + startdate + ", enddate=" + enddate + "]";
	}
	

}
