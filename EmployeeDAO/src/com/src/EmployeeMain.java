package com.src;
import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e=new Employee();
		Scanner s=new Scanner(System.in);
		EmployeDAO eda=new EmployeDAO();
		System.out.println("1.Insert");
		System.out.println("2.Select");
		System.out.println("3.SelectAll");
		System.out.println("4.Delete");
		System.out.println("5.Update");
		int choice=s.nextInt();
		switch(choice) {
		case 1:
		{
			System.out.println("id");
			int id=s.nextInt();
			System.out.println("name");
			String name=s.next();
			System.out.println("dateofbirth");
			int dob=s.nextInt();
			System.out.println("salary");
			int salary=s.nextInt();
			System.out.println("designation");
			String des=s.next();
			System.out.println("startdate");
			int sd=s.nextInt();
			System.out.println("enddate");
			int ed=s.nextInt();
		}
		case 2:
		{
				System.out.println("id");
				int id=s.nextInt();
				eda.selectEmployee(id);
				System.out.println(e.getId()+" | "+e.getName()+" | "+e.getDateofbirth()+" | "+e.getSalary()+" | "+e.getDesignation()+" | "+e.getStartdate()+" | "+e.getEnddate());
			    break;
			}
			case 3:
			{
			eda.selectAllEmployee();
			System.out.println(e.getId()+" | "+e.getName()+" | "+e.getDateofbirth()+" | "+e.getSalary()+" | "+e.getDesignation()+" | "+e.getStartdate()+" | "+e.getEnddate());
			break;
			}
			case 4 :
			{
				System.out.println("id");
				int id=s.nextInt();
				boolean res=eda.deleteEmployee(id);
				if(res)
				{
					System.out.println("it will");
				}
				else
				{
					System.out.println("not");
				}
				break;
			}
			case 5 :
			{
				System.out.println("id");
				int id=s.nextInt();
				System.out.println("name");
				String name=s.next();
				System.out.println("dateofbirth");
				int dob=s.nextInt();
				System.out.println("salary");
				int salary=s.nextInt();
				System.out.println("designation");
				String des=s.next();
				System.out.println("start date");
				int sd=s.nextInt();
				System.out.println("end date");
				int ed=s.nextInt();
				boolean res=eda.updateEmployee(e);
				if(res)
				{
					System.out.println("success");
				}
				else
				{
					System.out.println("not");
				}
				break;
			}
				
			}
	}
}

		



