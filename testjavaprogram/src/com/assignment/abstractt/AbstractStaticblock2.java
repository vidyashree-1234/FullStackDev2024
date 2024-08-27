package com.assignment.abstractt;
abstract class Subjects
{
	
	static 
	{
		System.out.println("Static block executed");
	}
 }
	class Library extends Subjects
	{
		
	}

public class AbstractStaticblock2 {
	public static void main(String []args) {
	Library o=new Library();
	  }
	}
