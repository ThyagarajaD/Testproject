package Numberpatternprogram;

import java.util.Scanner;

public class NaturalNumber {

	public static void main(String[] args) {

		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the first n natural number");
		int n = scan.nextInt();
		NaturalNumber1 nat = new NaturalNumber1();
		nat.thyagi(n);
	}

}
