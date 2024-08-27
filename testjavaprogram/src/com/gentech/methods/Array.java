package com.gentech.methods;
class Arraydisplay
{
    void display(String a[])
    {
        for(int i=a.length-1;i>=0;i--)
        {
            System.out.println(a[i]);
        }
    }

}


public class Array {

	public static void main(String[] args) {
		 String a[]={"sum","add","mul"};
	        Arraydisplay ay =new Arraydisplay();
	          ay.display(a);
	}

}
