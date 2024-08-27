package com.gentech.noargs.programs;
class Student1
{
	String name;
	int id;
	 Student1()
	 {
		 name="pooja";
		 id=80;
		 System.out.println("name:"+name);
		 System.out.println("id:"+id);
		 System.out.println("++++++++++");
	 }
}
class library1
{
	String name;
	int numb;
	library1()
	{
		name="books";
		numb=208;
		System.out.println("name:"+name);
		System.out.println("numb:"+numb);
		System.out.println("++++++++++");
		
	}
}
class Report1
{
	String name;
	int id;
	Report1()
	{
		name="internet";
		id=96;
		System.out.println("name:"+name);
		System.out.println("id:"+id);
		System.out.println("++++++++++");
	}
}
class Computerlab1
{
	String name;
	int labno;
	Computerlab1()
	{
		name="dsp";
		labno=899;
	    System.out.println("name:"+name);
	    System.out.println("labno:"+labno);
	    System.out.println("++++++++++");
	}
}

public class Collegee 
{
	public static void main(String[] args) 
	{
		Student1 stdt=new Student1();
		library1 liby=new library1();
		Report1 rept=new Report1();
		Computerlab1 com=new Computerlab1();
	}
		// TODO Auto-generated method stub

}


