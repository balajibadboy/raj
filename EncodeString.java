package com.java.lang.String;
import java.util.ArrayList;
import java.util.Scanner;
public class EncodeString {
	
			public static String[] SplitString(String a) {
			int remainder = a.length() % 3;
			int div = a.length() / 3;
			String Fname = "";
			String Mname = "";
			String Lname = "";
			if (remainder == 1) {
				Fname = a.substring(0, div);
				Mname = a.substring(Fname.length(), Fname.length() + div + remainder);
				Lname = a.substring(Mname.length() + Fname.length(), a.length());
				System.out.println(Fname + "" + Mname + "" + Lname);
			}
			if (remainder == 2) {
	
				Fname = a.substring(0, div + 1);
				Mname = a.substring(Fname.length(), Fname.length() + div );
				Lname = a.substring(Mname.length() + Fname.length(), a.length());
				System.out.println(Fname + "" + Mname + "" + Lname);
			}
			if (remainder == 0) {
				Fname = a.substring(0, div);
				Mname = a.substring(Fname.length(), Fname.length() + div );
				Lname = a.substring(Mname.length() + Fname.length(), a.length());
				System.out.println(Fname + "" + Mname + "" + Lname);
			}
			return new String[] { Fname, Mname, Lname };
		}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> name = new ArrayList<String>();
				int n = 3;
				System.out.println("enter names");
				for (int i = 0; i < n; i++) {
					name.add(sc.next());
	
				}
		String name1[] = SplitString(name.get(0));
		String name2[] = SplitString(name.get(1));
	String name3[] = SplitString(name.get(2));

		String op1 = name1[0] + name2[1] + name3[2];
		String op2 = name1[1] + name2[2] + name3[0];
		String op3 = name1[2] + name2[0] + name3[1];

		System.out.println("op1=" + op1);
		System.out.println("op2=" + op2);

		System.out.println("op3=" + op3.toUpperCase());


}

	
	}