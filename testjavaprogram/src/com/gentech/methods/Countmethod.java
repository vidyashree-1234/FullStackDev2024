package com.gentech.methods;
class Count1
{
	void sum()
	{
		int count=0;
		for(int i=50;i<=150;i++){
			if(i%6==0) {
		
			count=count+1;
			}
		}
		System.out.println(count);
	}
	
}


public class Countmethod {

	public static void main(String[] args) {
		Count1 o=new Count1();
		o.sum();

	}

}
