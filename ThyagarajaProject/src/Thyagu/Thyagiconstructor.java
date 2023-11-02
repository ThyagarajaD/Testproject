package Thyagu;
import java.util.Scanner;
public class Thyagiconstructor {
	
	public static void main(String[] args) {
		//creating the object of Scanner(System.in);
		Scanner scan = new Scanner(System.in);
		//Asking user to enter a number
	    System.out.println("Enter the number");
	    //checking whether the number is in the range of
		int num = scan.nextInt();
		if(num >=1 && num <=10 )
		{
			System.out.println("range 1");
			
		}
		//checking whether the number is in the range of 11 to 20
		else if(num >=11 && num <=20) { 
			System.out.println("range 2");
			
	    }
		//checking whether the number is in the range of 21 to 30

	    else if(num >=21 && num <=30) {
		System.out.println("range 3");

        }
		//checking whether the number is in the range of 31 to 40
        else if(num >=31 && num <=40) {
	    System.out.println("range 4");
	
	   }
		//checking whether the number is in the range of 41 to 50
        else if(num >=41 && num <=50) {
		System.out.println("range 5");
		
		}
		//If the number is not in the range, printing outside range
        else
        {
    	System.out.println("outside rane");
        }
        }
}
    	
    



