package com.gentech.noargs.programs;
class Country1
{
	int id;
	String name;
	Country1()
	{
		id=91;
		name="India";
		System.out.println("name:"+name);
		System.out.println("id:"+id);
		System.out.println("++++++++++");
	}
}
class State1
{
	int id;
	String statename;
	State1()
	{
		id=05;
		statename="Karnataka";
		System.out.println("statename:"+statename);
		System.out.println("id:"+id);
		System.out.println("++++++++++");
	}
}
class District1
{
	int id;
	String name;
	District1()
	{
		id=45;
		name="coorg";
		System.out.println("name:"+name);
		System.out.println("id:"+id);
		System.out.println("++++++++++");
	}
}

public class Continent 
{
	public static void main(String[] args) 
	{
		Country1 cy=new Country1();
		State1 st=new State1();
		District1 dt=new District1();
		// TODO Auto-generated method stub

	}

}
