package com.gentech.program;
class Product
{
	String item;
	int id;
}
class Sale
{
	String name;
	int id;
}
class Order
{
	String name;
	int id;
}
public class Marketing 
{
	public static void main(String[] args) 
	{
		Product prd=new Product();
		prd.id=10;
		prd.item="phone";
		System.out.println("item:"+prd.item);
		System.out.println("id:"+prd.id);
		System.out.println("+++++++");
		Sale sal=new Sale();
		sal.name="lia";
		sal.id=25;
		System.out.println("name:"+sal.name);
		System.out.println("id+"+sal.id);
		System.out.println("+++++++");
		Order ord=new Order();
		ord.name="riya";
		ord.id=50;
		System.out.println("name:"+ord.name);
		System.out.println("id:+ord.id");
		System.out.println("++++++++");
		// TODO Auto-generated method stub

	}

}
