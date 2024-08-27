package com.practice.programs;
class fruits1
{
	String name;
	int total;
	int price;
	fruits1()
	{
		name="mango";
		total=2;
		price=100;
		System.out.println("name:"+name);
		System.out.println("total:"+total);
		System.out.println("price:"+price);
		System.out.println("++++++++++++");
	}
}
class veg1
{
	String name;
	int total;
	int price;
	veg1()
	{
		name="potato";
		total=3;
		price=80;
		System.out.println("name:"+name);
		System.out.println("total:"+total);
		System.out.println("price:"+price);
		System.out.println("++++++++++++");
	}
}
class flower1
{
	String name;
	int total;
	int price;
	flower1()
	{
		name="jashmin";
		total=5;
		price=500;
		System.out.println("name:"+name);
		System.out.println("total:"+total);
		System.out.println("price:"+price);
		System.out.println("++++++++++++");
	}
}
public class noargs 
{
	public static void main(String[] args) 
	{
		fruits1 ft=new fruits1();
		veg1 vt=new veg1();
		flower1 fv=new flower1();
	}

}
