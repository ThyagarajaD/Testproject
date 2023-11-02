package Thyagu;

import java.util.Scanner;

public class Adult02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the age");
		
		int a = scan.nextInt();
		AgeApp a1 = new AgeApp();
		a1.above(a);
		

	}

}
