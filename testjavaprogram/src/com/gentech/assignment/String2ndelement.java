package com.gentech.assignment;
class ReadHalfEle
{
	void read(String a[])
	{
		for(int i=a.length/2;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
}

public class   String2ndelement {

	public static void main(String[] args) {
	   String a[] = {"aaa","hhh","kkkk","gggg","iiii","rrrr"};
	   ReadHalfEle hf=new ReadHalfEle();
	   hf.read(a);
	   

	}

}

