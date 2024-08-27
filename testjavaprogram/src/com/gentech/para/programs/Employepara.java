package com.gentech.para.programs;
class Employe2
{
	String name;
	int id;
	int age;
	Employe2(String nm,int Id,int Age)
	{
		name=nm;
		id=Id;
		age=Age;
		System.out.println("name:"+nm);
		System.out.println("id:"+Id);
		System.out.println("age:"+Age);
		System.out.println("++++++++");
	}
}
class Department2
{
	int deptno;
	String dept;
	int noofemploye;
	Department2(int Dptno,String Dept,int No)
	{
	deptno=Dptno;
	dept="Dept";
	noofemploye=No;
	System.out.println("deptno:"+Dptno);
	System.out.println("dept:"+Dept);
	System.out.println("noofemploye:"+No);
	System.out.println("+++++++++");
	}
}
class Insurance2
{
	 int insuranceid;
	 String type;
	 String name;
	 Insurance2(int ins,String Type,String nm)
	 {
	  insuranceid=ins;
	  type="Type";
	  name="nm";
	  System.out.println("insuranceid"+ins);
	  System.out.println("type:"+Type);	
	  System.out.println("name:"+nm);
	  System.out.println("+++++++++");
	 }
}
public class Employepara 
{
	public static void main(String[] args) 
	{
		Employe2 epy2  = new Employe2("santosh",20,33);
		Department2 dpt2 =new Department2(1,"sale",100);
		Insurance2 irc2  =new Insurance2(12,"longterm","health insurance");
	}

}
