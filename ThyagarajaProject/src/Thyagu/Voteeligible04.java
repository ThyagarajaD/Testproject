package Thyagu;
import java.util.Scanner;
public class Voteeligible04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the age");
		
		int a = scan.nextInt();
		Questions04 Q4 = new Questions04();
		Q4.age(a);
		

	}

}
