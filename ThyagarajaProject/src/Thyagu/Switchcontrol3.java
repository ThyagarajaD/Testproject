package Thyagu;

import java.util.Scanner;

public class Switchcontrol3 {

	public static void main(String[] args) {
		Scanner scan = new 	Scanner(System.in);
		System.out.println("Enter the first number");
		int num1 = scan.nextInt();
		
		switch(num1)
		{
		case 1:
			System.out.println("One");
			break;
		
		case 2:
			System.out.println("Two");
			break;
		
		case 3:
			System.out.println("Three");
			break;
		
		case 4:
			System.out.println("Four");
			break;
		
		case 5:
			System.out.println("Five");
			break;
			
		default:System.out.println("Invalid input");
		
		}
		

	}

}
