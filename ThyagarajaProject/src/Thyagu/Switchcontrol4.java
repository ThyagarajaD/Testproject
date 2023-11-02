package Thyagu;
import java.util.Scanner;
public class Switchcontrol4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the name");
		String a = scan.nextLine();
		
		switch(a)
		{
		case "Ajay":
			System.out.println("Delhi");
			break;
		
		case "Arjun":
			System.out.println("Pune");
			break;
		
		case "Ankith":
			System.out.println("Bangalore");
			break;
		
		case "Akash":
			System.out.println("Hyderbad");
			break;
		
		default:System.out.println("Invalid input");
		}
			
		}
		

	}


