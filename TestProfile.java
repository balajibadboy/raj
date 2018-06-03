package com.personalinfo;

public class TestProfile {
	
public static  void printProfile(IProfile profile)
{
	profile.myBasicInfo();
	profile.myHobbies();
	}
public static void main(String args[]) 
{
IProfile myProfile=new BalajiProfile();
 printProfile(myProfile);
 
}
}
