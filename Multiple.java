package com.basic;

public class Multiple { 
	int a;
	int b;
	public void Multiple(int a,int b) {
		if(a%b==0) {
			System.out.println("true");
			}
			else
			{	System.out.println("false");
			}
		}
	public static void main(String args[])
	{Multiple N=new Multiple();
	N.Multiple(10,7);
		
	}
}
