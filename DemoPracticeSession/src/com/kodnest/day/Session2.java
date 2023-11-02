package com.kodnest.day;

public class Session2 {

	public static void main(String[] args) 
	 {
	 int a= 20;
	 byte b =(byte)a;//type casting
	 a = a+b;
	 b = (byte)((b++)+(a*b)+(a/b)+(b%a));
	 System.out.println(b);
	 long l = b;
	 int m = 12;
	 byte g =(byte) m;

	}

}
