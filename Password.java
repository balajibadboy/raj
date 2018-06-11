package com.basic;

public class Password {
	public int findpassword(int a,int b,int c,int d,int e)
	{ 
		int p1=show(a);
		int p2=show(b);
		int p3=show(c);
		int p4=show(d);
		int p5=show(e);
		int p=p1+p2+p3+p4+p5;
		System.out.println("password is ");
		return p;
	}
	public static int show(int x){
	String s=String.valueOf(x);
	String a="";
	int password=0;
	int count=0;
	for(int i=0;i<s.length();i++)
	{
	for(int j=0;j<s.length();j++)
	{
	if(s.charAt(i)==s.charAt(j))
	{ 
	if(i!=j)
	{
		count=1;
	a += s.charAt(i); 
	}
	}
	}
	}
	if(count==0)
	{
		return password;
	}
	else
	{
	}
	if(a.equals(s)==true)
	{ 
	return password;
	}
	else
	{
	password=Integer.parseInt(s);
	System.out.println("unstable number is"+password);
	return password;
	}
	
	}
	
	
	public static void main(String[] args) {
		Password stable=new Password();
		System.out.println(stable.findpassword(12,1311,122,678,89)) ;
}}