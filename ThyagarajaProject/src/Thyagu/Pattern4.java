package Thyagu;

import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");
		int row=scan.nextInt();
		System.out.println("enter the number");
		int col=scan.nextInt();
		System.out.println("enter the character");
		char ch=scan.next().charAt(0);
		
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=col;j++)
			{  
				if(i==1||i==row || j==1||j==col)
				{
					System.out.print(ch);
				}
				else
				{
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
		
	}
}
