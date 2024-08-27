package com.gentech.program;
class Employee
{
    String name;
    int id;
    int age;
}
class Department
{
	int deptno;
	String dept;
}
class Insurance 
{
	 int insuranceid;
	 String type;
}

	public class Sample
	{
	public static void main(String[] args) 
	{
		Employee emp = new Employee();
		emp.name="santosh"; 
		emp.id=20;
		emp.age=35;
		System.out.println("name:"+emp.name);
		System.out.println("id:"+emp.id);
		System.out.println("age:"+emp.age);
		System.out.println("+++++++++");
		Department dept=new Department();
		dept.deptno=1;
		dept.dept="sales";
		System.out.println("no:"+dept.deptno);
		System.out.println("dept:"+dept.dept);
		System.out.println("+++++++++");
		Insurance insc =new Insurance();
		insc.insuranceid=11;
		insc.type="longterm";
		System.out.println("id:"+insc.insuranceid);
		System.out.println("type:"+insc.type);
		System.out.println("+++++++++");
			// TODO Auto-generated method stub
	

	}

}
