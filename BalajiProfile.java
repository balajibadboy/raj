package com.personalinfo;

public class BalajiProfile implements IProfile {

	@Override
	public void myBasicInfo()
	{
		System.out.println("firstname:balaji");
		System.out.println("lastname:raj");
		System.out.println("age:20");
		
	}

	@Override
	public void myHobbies() 
	{
				System.out.println("Hobby:watch movies");
	}

}
