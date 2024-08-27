package com.gentech.program;
class Student
{
	String name;
	int id;
}
class library
{
	String name;
	int numb;
}
class Report
{
	String name;
	int id;
}
class Computerlab
{
	String name;
	int labno;
}

public class college 
{

	public static void main(String[] args) 
	{
		Student std=new Student();
		std.id=12;
		std.name="pooja";
		System.out.println("name:"+std.name);
		System.out.println("id:"+std.id);
		System.out.println("+++++++");
		library lib=new library();
		lib.name="books";
		lib.numb=906;
		System.out.println("name:"+lib.name);
		System.out.println("numb+"+lib.numb);
		System.out.println("+++++++");
        Report rep=new Report();
		rep.name="internet";
		rep.id=34567;
		System.out.println("name:"+rep.name);
		System.out.println("id:+rep.id");
		System.out.println("++++++++");
		// TODO Auto-generated method stub

	}

}
