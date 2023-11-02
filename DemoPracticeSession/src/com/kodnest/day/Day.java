package com.kodnest.day;
import java.util.Scanner;
public class Day {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number byte");	
		byte b = scan.nextByte();
		System.out.println("Enter the number short");	
		short s = scan.nextShort();
		System.out.println("Enter the number int");	
		int i = scan.nextInt();
		System.out.println("Enter the number long");	
		long l = scan.nextLong();
		//float s = scan.nextFloat();
		//double d = scan.nextDouble();
		//char c = scan.next().charAt(0)
		//boolean k = scan.nextBoolean();
		l = b+s;
		i=(int)l;
		System.out.println(l);	
		
		     
	}

}
