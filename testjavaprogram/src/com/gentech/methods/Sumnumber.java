package com.gentech.methods;
class Sum
{
	void sum()
	{
		int sum=0;
		for(int i=0;i<=50;i++)
		{
			sum=sum+i;
		}
		System.out.println(sum);
	}
}
public class Sumnumber {

	public static void main(String[] args) {
		Sum sm=new Sum();
		sm.sum();
		

	}

}
