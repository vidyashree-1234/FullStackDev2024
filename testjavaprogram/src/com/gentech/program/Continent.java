package com.gentech.program;
class Country
{
	int id;
	String name;
}
class State
{
	int id;
	String name;
}
class district
{
	int id;
	String name;
}

public class Continent 
{
	public static void main(String[] args) 
	{
		Country cty=new Country();
		cty.id=91;
		cty.name="India";
		System.out.println("name:"+cty.name);
		System.out.println("id:"+cty.id);
		System.out.println("+++++++");
		State stt=new State();
		stt.name="Karnataka";
		stt.id=05;
		System.out.println("name:"+stt.name);
		System.out.println("id+"+stt.id);
		System.out.println("+++++++");
		district dis=new district();
		dis.name="coorg";
		dis.id=45;
		System.out.println("name:"+dis.name);
		System.out.println("id:+dis.id");
		System.out.println("++++++++");
		// TODO Auto-generated method stub

	}

}
