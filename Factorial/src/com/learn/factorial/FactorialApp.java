package com.learn.factorial;

import java.util.Scanner;

public class FactorialApp {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the number");
	int n = scan.nextInt();
	Factorial f = new Factorial();
	System.out.println(f.fact(n));

	}

}

