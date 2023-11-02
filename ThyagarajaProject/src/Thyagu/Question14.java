package Thyagu;
import java.util.Scanner;
public class Question14 {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of the rectangle");
		int length = scan.nextInt();
		System.out.println("Enter the size of the rectangle");
		int size = scan.nextInt();
		rectangle1 r1 = new rectangle1();
		r1.thyag(length,size);
			

	}

}
