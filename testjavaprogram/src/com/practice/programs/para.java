package com.practice.programs;
class fruits2
{
	String name;
	int total;
	int price;
	fruits2(String nm,int tl,int pr)
	{
		name=nm;
		total=tl;
		price=pr;
		System.out.println("name:"+name);
		System.out.println("total:"+total);
		System.out.println("price:"+price);
		System.out.println("++++++++++++");
	}
}
class veg2
{
	String name;
	int total;
	int price;
	veg2(String nm,int tl,int pr)
	{
		name=nm;
		total=tl;
		price=pr;
		System.out.println("name:"+name);
		System.out.println("total:"+total);
		System.out.println("price:"+price);
		System.out.println("++++++++++++");
	}
}
class flower2
{
	String name;
	int total;
	int price;
	flower2(String nm,int tl,int pr)
	{
		name=nm;
		total=tl;
		price=pr;
		System.out.println("name:"+name);
		System.out.println("total:"+total);
		System.out.println("price:"+price);
		System.out.println("++++++++++++");
	}
}
public class para {

	public static void main(String[] args) {
		fruits2 ft=new fruits2("banana",4,100);
		veg2 vt=new veg2("onion",6,300);
		flower2 fv=new flower2("sflowre",3,800);

	}

}
