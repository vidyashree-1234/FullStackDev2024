package com.assignment.abstractt;
abstract class Student1
{
	String sname;
	int sid;
	int age;
	
	{
		sname="Vidya";
		System.out.println("Student Name :"+sname);
		sid=124;
		System.out.println("Student Id :"+sid);
		age=22;
		System.out.println("Age :"+age);
	}
}
class Student2 extends Student1
{
	
}
public class AbstractInstanceBlock3 {

	public static void main(String[] args) {
		Student2 ob1=new Student2();
	}

}
