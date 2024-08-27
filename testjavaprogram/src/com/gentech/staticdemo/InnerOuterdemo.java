package com.gentech.staticdemo;
class Outer
{
	private Inner In=new Inner();
	private class Inner
	{
		int Sid;
		String Stdname;
		void showinner()
		{
			Sid=10;
			Stdname="vidya";
			System.out.println("sid:"+Sid);
			System.out.println("Stdname:"+Stdname);
		}
	}

	void showouterinner()
		{
			In.showinner();
		}
	}
	public class InnerOuterdemo{
		public static void main(String[] args)
		{
			Outer o=new Outer();
			o.showouterinner();
		}
	}
