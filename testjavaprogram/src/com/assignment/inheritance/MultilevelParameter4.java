package com.assignment.inheritance;
class Student
{
	Student(String name,int id)
	{
		System.out.println("Student name:"+name);
		System.out.println("Student ID:"+id);
	}
}
class Course extends Student
{
	String Cname;
	Course()
	{
		super("Vidya",2145);
		Cname="B.E";
		System.out.println("Course name:"+Cname);
	}
}
class Branch extends Course
{
	String Bname;
	Branch()
	{
		Bname="EC";
		System.out.println("Branch name:"+Bname);
	}
}
public class MultilevelParameter4 {

	public static void main(String[] args) {
	    Branch o=new Branch();

	}

}