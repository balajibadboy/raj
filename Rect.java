package com.basic;

public class Rect {
	double side;
	double length;
	double width;

public Rect(double side) {
	this.side=side;
}
public Rect(double length,double width) {
	if(length>0.0 && length<20.0 && width>0.0 && width<20.0) {
 this.length=length;
 this.width=width;
	}else
	{System.out.println("length and width is should not be >0.0 and <20.0");
	}
	}


public static void main(String args[])
{
	//Rect square=new Rect();
	Rect data=new Rect(2,5
			);
//System.out.println(Rectangle.Rect());
}
}