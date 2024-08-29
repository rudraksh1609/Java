package Java1609;
import java.util.*;
public class StringClass 
{
	public static void main(String [] args)
	{
		char c='a';
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First String : ");
		String s1=sc.nextLine();
		System.out.println("Enter Second String : ");
		String s2=sc.nextLine();
		System.out.println("Index of "+c+" = "+s1.indexOf(c));
		System.out.println("Character at index 3 = "+s1.charAt(3));
		System.out.println("Upper Case : "+s1.toUpperCase());
		System.out.println("Lower Case : "+s1.toLowerCase());
		if(s1.compareTo(s2)>0)
		{
			System.out.println(s1+" is greater than "+s2);
		}
		else if(s1.compareTo(s2)<0)
		{
			System.out.println(s2+" is greater than "+s1);
		}
		else
		{
			System.out.println(s1+" is equal to "+s2);
		}
		System.out.println("Substring of "+s1+" = "+s1.substring(0,4));
	}
}