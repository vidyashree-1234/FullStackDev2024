package com.assignment.abstractt;
abstract class Student
{
	 static void studentname(String name)
	 {
		System.out.println("Student name:"+name);
	 }
	 static void studentid(int id)
	 {
		 System.out.println("Student id:"+id);
	 }
	 static void studentage (int age)
	 {
		 System.out.println("Student age:"+age);
	 }
	 
}
public class AbstractStaticMethod1 {
	public static void main(String[] args)
	{
		Student.studentname("Vidya");
		Student.studentid(675);
		Student.studentage(6);
	}

}