package Thyagu;

public class Question022 {

	public static void character(int ch)
	{ 
		if(ch>='a'&& ch<='z')
        {
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
		{
			System.out.println("Lower case vowels");
		}
		else
		{
			System.out.println("Lower case consonant");
		}
        }
		if(ch>='A'&& ch<='Z')
		{
	    if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
		{
			System.out.println("Upper case vowels");
		}
		else
		{
			System.out.println("Upper case consonant");	
		}
		}
		else if(ch>='0' && ch<='9')
        {
        	System.out.println("Digital");
        }
        else
        {
        	System.out.println("Special character");
        }

	}

}
