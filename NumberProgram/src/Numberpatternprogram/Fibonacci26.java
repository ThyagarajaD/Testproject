package Numberpatternprogram;

public class Fibonacci26 {

	public static void thyagi(int n)
     {
	
	int fab1=0;
	int fab2=1;
	int fab3;
	if(n==0)
	{
		System.out.println(fab1);
	}
	else if(n==1)
	{
		System.out.println(fab1+" "+fab2);
	}
	else
	{
		System.out.println(fab1+" "+fab2);
		for(int i=1; i<=n; i++)
	{
	
			fab3=fab1+fab2;
			System.out.println(fab3);
			fab1=fab2;
			fab2=fab3;	
		}
		
		

	}

}
}