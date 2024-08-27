package com.gentech.noargs.programs;
class Product1
{
	String item;
	int id;
	int amount;
	Product1()
	{
		item="phone";
		id=45;
		amount=80000;
		System.out.println("item:"+item);
		System.out.println("id:"+id);
		System.out.println("amount:"+amount);
		System.out.println("++++++++++");
	}
	 
}
class Sale1
{
	String name;
	String deliveryperson;
	int id;
	Sale1()
	{   name="lia";
	    deliveryperson="sachin";
	    id=20;
		System.out.println("name:"+name);
		System.out.println("deliveryperson:"+deliveryperson);
		System.out.println("id:"+id);
		System.out.println("++++++++++");
	}
}
class Order1
{
	String name;
	int id;
	int phno;
	Order1()
	{
		name="riya";
		id=30;
		phno=998877665;
		System.out.println("name:"+name);
		System.out.println("phno:"+phno);
		System.out.println("id:"+id);
		System.out.println("++++++++++");
	}
}
public class Marketingg {

	public static void main(String[] args) 
	{
		Product1 prdt=new Product1();
		Sale1 sl=new Sale1();
		Order1 od=new Order1();
		// TODO Auto-generated method stub

	}

}
