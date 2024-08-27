package com.practice.programs;
class Fruits3
{
	Fruits3(String name,int total,float price)
	{
		System.out.println("Fruits3:"+name);
		System.out.println("Fruits3:"+total);
		System.out.println("Fruits3:"+price);
	}
}
class Veg3
{
	Veg3(String name,int total,float price)
	{
		System.out.println("Veg3:"+name);
		System.out.println("Veg3:"+total);
		System.out.println("Veg3:"+price);
	}
	
}
public class overload {

	public static void main(String[] args) {
		Fruits3 fr=new Fruits3("apple",8,900);
		Veg3 ve=new Veg3("beans",7,400);
	}

}
