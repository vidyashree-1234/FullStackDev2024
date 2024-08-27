package com.gentech.noargs.programs;
class Employe1
{
	String name;
	int id;
	int age;
	Employe1()
	{
		name="Santosh";
		id=20;
		age=35;
		System.out.println("name:"+name);
		System.out.println("id:"+id);
		System.out.println("age:"+age);
		System.out.println("++++++++");
	}
}
class Department1
{
	int deptno;
	String dept;
	int noofemploye;
	Department1()
	{
	deptno=1;
	dept="sales";
	noofemploye=100;
	System.out.println("deptno:"+deptno);
	System.out.println("dept:"+dept);
	System.out.println("noofemploye:"+noofemploye);
	System.out.println("+++++++++");
	}
}
class Insurance1 
{
	 int insuranceid;
	 String type;
	 String name;
	 Insurance1()
	 {
	  insuranceid=11;
	  type="longterm";
	  name="health insurance";
	  System.out.println("insuranceid"+insuranceid);
	  System.out.println("type:"+type);	
	  System.out.println("name:"+name);
	  System.out.println("+++++++++");
	 }
}

public class Employeenoargs
{
	public static void main(String[] args)
	{
		Employe1 epy  = new Employe1();
		Department1 dpt =new Department1();
		Insurance1 irc  =new Insurance1();
		// TODO Auto-generated method stub

	}

}
