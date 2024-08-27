package com.gentech.assignment;
class TwoDarray
{
	void tranforce(int a[][])
	{
		int b[][]=new int[3][3];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
		         b[j][i]=a[i][j];	
		       
			}
		}
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
	}
}

public class Intigertranspose  {
	public static void main(String args[])
	{
	int a[][]= {{10,20,30},{40,50,60},{70,80,90}};
	TwoDarray td =new TwoDarray();
	td.tranforce(a);
}
}
