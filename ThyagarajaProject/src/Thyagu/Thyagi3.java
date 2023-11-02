package Thyagu;
import java.util.Scanner;

public class Thyagi3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		double num = scan.nextDouble();
		int res = doubleTheNumber(num);
		System.out.println("The double of number is" +res);
		
	} 
	public static int doubleTheNumber(double num) {
		return ((int)) (num*2));

	}

}
