package Thyagu;
import java.util.Scanner;
public class Question15 {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number");
		int num1  = scan.nextInt();
		System.out.println("Enter the second number");
		int num2  = scan.nextInt();
		System.out.println("Enter the third number");
		int num3  = scan.nextInt();
		
		first1 V1 = new first1();
		V1.thyag(num1,num2,num3);
		
		

	}

}
