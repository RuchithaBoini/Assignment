package com.src;

public class Studentmorethan9 {
	int id;
	String name;
	String address;
	int mathmarks;
	int scimarks;
	int socmarks;
	int total;
	
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getMathmarks() {
		return mathmarks;
	}
	public void setMathmarks(int mathmarks) {
		this.mathmarks = mathmarks;
	}
	public int getScimarks() {
		return scimarks;
	}
	public void setScimarks(int scimarks) {
		this.scimarks = scimarks;
	}
	public int getSocmarks() {
		return socmarks;
	}
	public void setSocmarks(int socmarks) {
		this.socmarks = socmarks;
	}
	
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public Studentmorethan9(int id, String name, String address, int mathmarks, int scimarks, int socmarks) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.mathmarks = mathmarks;
		this.scimarks = scimarks;
		this.socmarks = socmarks;

	}
	public Studentmorethan9() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id+" "+name+" "+address;
	}
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Studentmorethan9 s=(Studentmorethan9)o;
		if(this.total>s.total) {
			return 1;
		}else
		return -1;
	}
}
