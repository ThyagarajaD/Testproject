package Thyagu;
import java.util.Scanner;
public class Thyagiconstructor3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	System.out.println("Enter the first number");
	double num1 = scan.nextDouble();
	
	System.out.println("Enter the second number");
	double num2 = scan.nextDouble();

	System.out.println("Enter an operation to be performed");
	char operation = scan.next().charAt(0);
	
	if(operation == '+')
		{
				System.out.println(num1+num2);
		}
	else if(operation == '-')
	    {
		System.out.println(num1-num2);
		}
	if(operation == '*')
		{
				System.out.println(num1*num2);
		}
	if(operation == '/')
		{
				System.out.println(num1/num2);
		}
	if(operation == '+')
		{
				System.out.println("Invalid input");
				
		}
	}
	

}
