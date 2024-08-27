package com.practice.programs;
class fruits4
{
	fruits4(String name)
	{
		System.out.println("fruits4 String:"+name);
	}
	fruits4(int total)
	{
		System.out.println("fruits4 int:"+total);
	}
	fruits4(float price)
	{
		System.out.println("fruits4 float:"+price);
	}
	
}
public class parapg {

	public static void main(String[] args) {
		fruits4 nm=new fruits4("apple");
		fruits4 it=new fruits4(6);
		fruits4 ft=new fruits4(200f);

	}

}
