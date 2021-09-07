package com.src;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.List;

public interface EmployeeImplement {
	public static final String jdbcurl="jdbc:mysql://localhost:3306/mydob";
	public static final String driverclass="com.mysql.cj.jdbc.Driver";
	public static final String username="boini";
	public static final String password="boini";
	Connection getConnection();
	void insertEmployee(Employee e);
	Statement selectEmployee(int id);
	List<Employee> selectAllEmployee();
	boolean deleteEmployee(int id);
	boolean updateEmployee(Employee e);
	

}
