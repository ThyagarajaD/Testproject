package Thyagu;
import java.util.Scanner;
public class Thyagi2 {

	public static void main(String[] args) {
		System.out.println("Subtraction:" +subtractNumbers(20, 5));
		System.out.println("Multiplicaion:" +multiplyNumbers(4, 5));
		System.out.println("Division:" +divideNumbers(20, 4));
		System.out.println("Remainder:" +findReminder(10, 3));
		
	}
	public static int subtractNumbers(int num1, int num2) {
		return num1-num2;
	}
	public static int multiplyNumbers(int num1, int num2) {
		return num1*num2;
	}
	public static double divideNumbers(int num1, int num2) {
		return num1/num2;
	}
	public static int findReminder(int num1, int num2) {
		return num1%num2;
	
		
	}

}
