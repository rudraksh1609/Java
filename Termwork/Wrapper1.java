package Java1609;
import java.util.*;
public class Wrapper1 
{
	public static void main(String [] args)
	{
		int i,n,digit=0,alpha=0,word=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String : ");
		String s=sc.nextLine();
		String st=new String(s);
		n=st.length();
		for(i=0;i<n;i++)
		{
			if(Character.isDigit(st.charAt(i)))
			{
				digit++;
			}
			if(Character.isAlphabetic(st.charAt(i)))
			{
				alpha++;
			}
			if(Character.isWhitespace(st.charAt(i)))
			{
				word++;
			}
		}
		System.out.println("Number of Digits in the string : "+digit);
		System.out.println("Number of Alphabets in the string : "+alpha);
		System.out.println("Number of Words in the string : "+(word+1));
	}
}
