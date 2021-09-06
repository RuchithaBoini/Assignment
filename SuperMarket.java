package com.src;
import java.util.Comparator;
import java.util.PriorityQueue;

public class SuperMarket {

	public static void main(String[] args) {
	PriorityQueue pq=new PriorityQueue(new MyComparator());
	pq.offer(new item(1000,"oil","sunflower"));
	pq.offer(new item(1500,"cerals","Aashirvad"));
	pq.offer(new item(2000,"cornflakes","bambino"));
	pq.offer(new item(2500,"ghee","aashiravad"));
	System.out.println(pq);
	}

}
class item{
	int price;
	String item;
	String itembrand;
	
	public int getPrice() 
	{
		return price;
	}
	public void setPrice(int price) 
	{
		 this.price=price;
	}
	public String getItem() 
	{
		return item;
	}
	public void setItem(String item) 
	{
		 this.item=item;
	}
	public String getItembrand() 
	{
		return itembrand;
	}
	public void setItembrand(String itembrand) 
	{
		this.itembrand=itembrand;
	}
	public item(int price,String item,String itembrand) {
		super();
		this.price=price;
		this.item=item;
		this.itembrand=itembrand;
	}
	public item() {
		super();
	}
	public String toString() {
		return "item[price="+price+",item="+item+",itembrand="+itembrand+"]\n  "
				+ "";
	}

	
}