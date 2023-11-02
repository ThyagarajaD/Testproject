package Thyagu;

public class Prime21 
{

	public static void thyagi1(int a)
	{
		for(int i=2; i<=a; i+=2)
		{
			System.out.println("the number divisible by 2:" +i);
		}

	}
	public static void thyagi2(int a)
	{
	for(int j=3; j<=a; j+=3)
	{
		   System.out.println("the number divisible by 3:" +j);
		
	    }

    }	
	public static void thyagi3(int a)
	{
	for(int k=5; k<=a; k+=5)
	{
		   System.out.println("the number divisible by 5:" +k);
	    }
	
    }
	public static void thyagi4(int a)
	{
	for(int l=100; l<=200; l++)
	{
		if(1%2==0 || 1%5==0)
		{
		   System.out.println("the number divisible by 2 and 5 is:" +l);
	   }
    }
	}
	public static void thyagi5(int a)
	{
	for(int m=100; m<=200; m++)
	{
		if(m%3==0 || m%5==0)
		{
		   System.out.println("the number divisible by 3 and comes in table 5 is:" +m);

      }
  
     }
	 }
	public static void thyagi6(int a)
	