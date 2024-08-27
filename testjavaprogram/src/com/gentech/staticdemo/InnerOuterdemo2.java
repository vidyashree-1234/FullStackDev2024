package com.gentech.staticdemo;
class Outer1 {
    Inner1 In = new Inner1();

    static class Inner1 {
        int Sid;
        String Stdname;
        int age;
        void showinner()
        {
        	Sid=10;
        	Stdname="vidya";
        	int age=20;
            System.out.println("sid: "+Sid);
        	System.out.println("Stdname: "+Stdname);
        	System.out.println("Ageis:"+age);
        	
        	
        }
   
        }
    void showouterinner()
    {
    	In.showinner();
 
    }
}
    

public class InnerOuterdemo2 {

	public static void main(String[] args) {
		Outer1 o=new Outer1();
		o.showouterinner();

	}

}