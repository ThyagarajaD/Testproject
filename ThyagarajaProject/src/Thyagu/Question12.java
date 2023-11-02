package Thyagu;
import java.util.Scanner;
public class Question12 {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("The polygon based on the number of its sides");
		String numberside = scan.nextLine();
		
		switch(numberside)
		{
		case "1":
		System.out.println("Polygon type of triangle");
		
		break;
		
		case "2":
		System.out.println("Polygon type of rectangle");
		
		break;
		
		case "3":
		System.out.println("Polygon type of quadrilateral");
		
		break;
		
		case "4":
		System.out.println("Polygon type of pentagon");
		
		break;
		
		case "5":
		System.out.println("Polygon type of hexagon");
		
		break;
		
		case "6":
		System.out.println("Polygon type of heptagon");
		
		break;
		
		case "7":
		System.out.println("Polygon type of octagon");
		
		break;
		
		case "8":
		System.out.println("Polygon type of nonagon");
		
		break;
		
		default:
			System.out.println("not a polygon");
		
		
		}
		
		
	
	

	}

}
