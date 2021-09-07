package com.src;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class EmployeDAO implements EmployeeImplement{
	@Override
	public Connection getConnection() {
		Connection c=null;
		try {
			Class.forName(driverclass);
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			c=DriverManager.getConnection(jdbcurl,username,password);
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	public void insertEmployee(Employee e) {
		String query="insert into Employee values(?,?,?,?,?,?,?)";
		try(Connection c=getConnection())
		{
			PreparedStatement ps = c.prepareStatement(query);
			ps.setInt(1, e.getId());
			ps.setString(2, e.getName());
			ps.setInt(3, e.getDateofbirth());
			ps.setInt(4, e.getSalary());
			ps.setString(5, e.getDesignation());
			ps.setInt(6, e.getStartdate());
			ps.setInt(7, e.getEnddate());
			
		}catch (SQLException e2) {
			e2.printStackTrace();
		}
		
	}
public Statement selectEmployee(int id) {
	String query="select * from Employee where id=?";
	try(Connection c=getConnection()){
		PreparedStatement ps = c.prepareStatement(query);
		ps.setInt(1, id);
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			Employee e=new Employee();
			e.setName(rs.getString(2));
            e.setDateofbirth(rs.getInt(3));
			e.setSalary(rs.getInt(4));
			e.setDesignation(rs.getString(5));
			e.setStartdate(rs.getInt(6));
			e.setEnddate(rs.getInt(7));
		}
	}catch(SQLException e) {
		e.printStackTrace();
	}
	return null;
	}
public List<Employee>selectAllEmployee(){
	return null;
}
public boolean deleteEmployee(int id) {
	boolean Result=false;
	String query="delete * from Employee where id=?";
	try(Connection c=getConnection())
	{
		PreparedStatement ps = c.prepareStatement(query);
		ps.setInt(1, id);
		Result = ps.executeUpdate()>0;
	}catch(SQLException e) {
		e.printStackTrace();
	}
	return Result;
}
public boolean updateEmployee(Employee e) {
	boolean Result=false;
	String query ="update * from Student where id=?,name=?,dateofbirth=?,salary=?,designation=?,startdate=?,enddate=?";
	try(Connection c=getConnection())
	{
		PreparedStatement ps = c.prepareStatement(query);
		ps.setInt(1, e.getId());
		ps.setString(2, e.getName());
		ps.setInt(3, e.getDateofbirth());
		ps.setInt(4, e.getSalary());
		ps.setString(5, e.getDesignation());
		ps.setInt(6, e.getStartdate());
		ps.setInt(7, e.getEnddate());
		
	}catch (SQLException e1) {
		e1.printStackTrace();
	}
	return Result;
	}
}


