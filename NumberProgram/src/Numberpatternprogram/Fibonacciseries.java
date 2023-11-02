package Numberpatternprogram;

import java.util.Scanner;

public class Fibonacciseries {

	public static void main(String[] args) 
	 {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the number");
		int n = scan.nextInt();
		Fibonacci26 fib = new Fibonacci26();
		fib.thyagi(n);

	}

}
