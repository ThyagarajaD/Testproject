package Thyagu;
import java.util.Scanner;
public class Question16 {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value for n:");
		int n  = scan.nextInt();
		int i=1;
		while(i<=n)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
			i++;

	}

}
}