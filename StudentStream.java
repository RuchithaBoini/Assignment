package com.src;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StudentStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Studentmorethan9> al=new ArrayList<Studentmorethan9>();
		al.add(new Studentmorethan9(1,"rohith","tuniki",98,28,96));
		al.add(new Studentmorethan9(2,"ruchitha","Nagpur",76,72,86));
		al.add(new Studentmorethan9(3,"ruhi","chennai",35,60,76));
		al.add(new Studentmorethan9(4,"rani","trivandram",98,78,76));
		al.add(new Studentmorethan9(5,"ram","ooty",67,57,98));
		al.add(new Studentmorethan9(6,"raja","mumbai",49,60,86));
		al.add(new Studentmorethan9(7,"rudh","hyderabad",79,38,76));
		al.add(new Studentmorethan9(8,"radha","ranchi",76,87,76));
		al.add(new Studentmorethan9(9,"renu","kanchipuram",65,07,95));
		
		/*ArrayList<StudentNew> total=(ArrayList<StudentNew>) s.map(o->((StudentNew)o).total=(((StudentNew) o).getMathmark()+((StudentNew)o).getScimark()+((Student)o).getSocmark())).collect(Collectors.toList());
		
		ArrayList<StudentNew> u1=(ArrayList<StudentNew>)s.map((o)->{
			StudentNew p=(StudentNew)o;
			p.total=(int)p.getMathmark()+(int)p.getScimark()+(int)p.getSocmark();
			return p;
		}).collect(Collectors.toList());
		
		System.out.println(u1);
		
		List<StudentNew> l=(List<StudentNew>) u1.stream().sorted((o1,o2)->((StudentNew)o1).total.compareto(((StudentNew)o2).total);
		
	System.out.println(l);*/
		
			Studentmorethan9 c=al.stream().max((i1,i2)->i1.compareTo(i2)).get();
		   System.out.println(c);
		   List<Studentmorethan9> l=al.stream().sorted((i1,i2)->((Studentmorethan9)i1).name.length()>((Studentmorethan9)i2).name.length()?-1:1).collect(Collectors.toList());
		   System.out.println(l);
		   List<Studentmorethan9> l1=al.stream().sorted((i1,i2)->((Studentmorethan9)i1).total/3>((Studentmorethan9)i2).total/3?-1:1).collect(Collectors.toList());
		   System.out.println(l1);

	}

}

