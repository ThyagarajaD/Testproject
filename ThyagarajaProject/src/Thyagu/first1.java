package Thyagu;

public class first1 
{
   int thyag(int num1, int num2, int num3)
   {
	   if(num1==num2 && num1==num3 && num2==num3 && num3==num2)
	   {
		   System.out.println("all number are eqaul");
	   }
	   else if(num1>num2 && num1<num3)
	   {
		   System.out.println("is first large number");
	   } 
	   else if(num2>num1 && num2>num3)
	   {
		   System.out.println("is second large number");
	   }
	   else
	   {
		   System.out.println("third is not large number");  
       }
	   return 0;
	

	}

}
