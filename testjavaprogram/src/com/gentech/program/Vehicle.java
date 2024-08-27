package com.gentech.program;
class Twowheeler
{
	String Vehiclename;
	int no;
}
class Fourwheeler
{
	String type;
	int no;
}
class Heavyvehicle
{
	String name;
	int no;
}

public class Vehicle {
	public static void main(String[] args) {
		Twowheeler vchl=new Twowheeler();
		vchl.Vehiclename="bike";
		vchl.no=123;
		System.out.println("Vehiclename:"+vchl.Vehiclename);
		System.out.println("no:"+vchl.no);
		System.out.println("+++++++");
		Fourwheeler forvchl=new Fourwheeler();
		forvchl.type="car";
		forvchl.no=5677;
		System.out.println("type:"+forvchl.type);
		System.out.println("no:"+forvchl.no);
		System.out.println("+++++++");
		Heavyvehicle hvy=new Heavyvehicle();
		hvy.name="truck";
		hvy.no=8765;
		System.out.println("name:"+hvy.name);
		System.out.println("no:+hvy.no");
		System.out.println("++++++++");
		
		// TODO Auto-generated method stub

	}

}
