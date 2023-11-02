package Thyagu;
import java.util.Scanner;
public class Question13 {

	public static void main(String[] args) 
	{
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the product name");
	String productname  = scan.nextLine();
	
	switch(productname)
	{
	case "1":
		System.out.println("pepsi");
		
		break;
	
	case "2":
		System.out.println("soda");
		
		break;
		
	case "3":
		System.out.println("chocolate");
		
		break;
		
	case "4":
		System.out.println("kitkat");
		
		break;
		
	case "5":
		System.out.println("milkybar");
		
		break;
		
	case "6":
		System.out.println("icecream");
		
		break;
		
	case "7":
		System.out.println("chips");
		
		break;
		
		default:
			System.out.println("not a product");
		
	}

	}

}
