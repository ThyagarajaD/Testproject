package Thyagu;
import java.util.Scanner;
public class Thyagi1 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the first number");
	long num1 = scan.nextLong();
	System.out.println("Enter the second number");
	long num2 = scan.nextLong();
	long res = galacticAddition(num1, num2);
	System.out.println("The addition of two number" +res);
	
	}
	public static long galacticAddition(long num1, long num2) {
		return num1+num2;
		

	}

}
