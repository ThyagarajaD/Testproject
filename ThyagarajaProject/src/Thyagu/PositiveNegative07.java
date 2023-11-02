package Thyagu;

import java.util.Scanner;

public class PositiveNegative07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int a = scan.nextInt();
		Question07 Q7 = new Question07();
		Q7.number(a);
	}

}
