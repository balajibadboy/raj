package com.java.lang.String;

import java.util.Scanner;

public class Pn {

	
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	if(n!=0){
	if((n>=1) && (n<=100000))
	System.out.println("positive");
	else
	System.out.println("negative");
	}
	else
	System.out.println("zero");
	}
	}


