package com.gentech.noargs.programs;
class Twowheeler1
{
	String Vehiclename;
	int no;
	int licenceno;
	Twowheeler1()
	{
		Vehiclename="bike";
		no=25;
		licenceno=23456;
		System.out.println("Vehiclename:"+Vehiclename);
		System.out.println("no:"+no);
		System.out.println("licenceno:"+licenceno);
		System.out.println("++++++++++");
	}
}
class Fourwheeler1
{
	String type;
	int no;
	int licenceno;
    Fourwheeler1()
    {
    	type="car";
    	no=26;
    	licenceno=76588;
    	System.out.println("type:"+type);
		System.out.println("no:"+no);
		System.out.println("licenceno:"+licenceno);
		System.out.println("++++++++++");
    }
}
class Heavyvehicle1
{
	String name;
	int no;
	int licenceno;
	Heavyvehicle1()
	{
		name="truck";
		no=27;
		licenceno=99876;
		System.out.println("name:"+name);
		System.out.println("no:"+no);
		System.out.println("licenceno:"+licenceno);
		System.out.println("++++++++++");
    }
}
public class Vehiclee 
{
	public static void main(String[] args) 
	{
		Twowheeler1 vcl=new Twowheeler1();
		Fourwheeler1 forvcl=new Fourwheeler1();
		Heavyvehicle1 hevy=new Heavyvehicle1();
		// TODO Auto-generated method stub

	}

}
