package Thyagu;

public class catergorizes1 
      {
	int thyag(int age)
	{
		if(age>=0 && age<=12)
		{
		System.out.println("chid");	
		}
		else if(age>=12 && age<=19)
		{
		System.out.println("teen");	
		}
		else if(age>=20 && age<59)
		{
		System.out.println("adult");	
		}
		else if(age>=60)
		{
		System.out.println("senior");		
		}
		else
		{
			System.out.println("dead");		
		}
		return 0;
		
	}

}
