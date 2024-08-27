package com.practice.programs;
class fruits
{
	String name;
	int total;
	int price;
}
class veg
{
	String name;
	int total;
	int price;
}
class flower
{
	String name;
	int total;
	int price;
}
public class foods {
	public static void main(String[] args) {
		fruits fr=new fruits();
		fr.name="apple";
        fr.total=1;
        fr.price=50;
        System.out.println("name:"+fr.name);
        System.out.println("total:"+fr.total);
        System.out.println("price:"+fr.price);
        System.out.println("++++++++++++++");
        veg vg=new veg();
		vg.name="tomato";
        vg.total=2;
        vg.price=80;
        System.out.println("name:"+vg.name);
        System.out.println("total:"+vg.total);
        System.out.println("price:"+vg.price);
        System.out.println("++++++++++++++");
        flower fl=new flower();
		fl.name="rose";
        fl.total=5;
        fl.price=200;
        System.out.println("name:"+fl.name);
        System.out.println("total:"+fl.total);
        System.out.println("price:"+fl.price);
        
	}

}
