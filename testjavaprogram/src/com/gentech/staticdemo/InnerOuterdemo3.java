package com.gentech.staticdemo;
class Outernew3
{
	 Inner1 In =new  Inner1();
	 Inner2 Inn = new  Inner2();	
	 void showtwoinnerclass()
	{
		In.Innerclass();
		Inn.Innerclass2();
	}
	 
	
	private class Inner1
	{
		void Innerclass()
		{
		String stdname="vidya";
		int sid=10;
		System.out.println("sid: "+sid);
      	System.out.println("Stdname: "+stdname);
		}
		
			
	}
	private class Inner2
	{
		 void Innerclass2()
		{
			String stdname="santosh";
			int sid=20;
			System.out.println("sid: "+sid);
	      	System.out.println("Stdname: "+stdname);
			
		}
		
	}
	
}

public class InnerOuterdemo3 {

	public static void main(String[] args) {
		Outernew3 o=new Outernew3();
		o.showtwoinnerclass();

	}

}
