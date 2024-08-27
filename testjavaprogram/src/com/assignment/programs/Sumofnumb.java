package com.assignment.programs;
class sumofeachdigit
{
	 void sumofeach(int a)
	 {
		 int sum=0;
		 while(a!=0)
		 {
		
		 sum+=a%10;
		 a=a/10;
	 }
		 System.out.println(sum); 
}	
}

public class Sumofnumb {
	 
	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);
		sumofeachdigit sm=new sumofeachdigit();
		sm.sumofeach(a);
		

	}

}
