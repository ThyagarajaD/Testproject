package Thyagu;
import java.util.Scanner;
public class Capitalletter5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the age");
		char a = scan.next().charAt(0);
		Capital c1 = new Capital();
		c1.letter(a);
		

	}

}
