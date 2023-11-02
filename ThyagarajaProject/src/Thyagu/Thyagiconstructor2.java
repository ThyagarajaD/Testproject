package Thyagu;
import java.util.Scanner;

public class Thyagiconstructor2 {

	public static void main(String[] args) {
		//creating the object of Scanner class
		Scanner scan = new Scanner(System.in);
		//Asking user to enter a number
		System.out.println("Enter a character");
		//Storing the character in variable ch
		char ch = scan.next() .charAt(0);
		//Checking weather the character is uppercase
		if(ch>= 'A' && ch<= 'Z')
		{
			System.out.println("Uppercase letter");
		}
		//Checking weather the character is lowercase
		else if(ch>= 'a' && ch<='z')
		{
			System.out.println("lower letter");
		}
		//Checking weather the character is number
		else if(ch>= '0' && ch<='9')
		{
			System.out.println("It is number");	
		}
		//otherwise the character is special character
		else
		{
			System.out.println("It is a special character");
		}
		
		}
		
}