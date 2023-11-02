package Thyagu;

import java.util.Scanner;

public class Pattern16 {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the number");
		int a=scan.nextInt();
		System.out.println("enter the character");
		char ch =scan.next().charAt(0);
		
		for(int i=1;i<=5;i++)
		{
	    for(int j=1;j<=5;j++)
	    {
	    	System.out.print(i);
	    }
	    System.out.println();
		}
         
	}

}


	
