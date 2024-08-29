package Java1609;

import java.util.*;
public class replace0to1 
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any integer value : ");
		int n=sc.nextInt();
		int x=n;
		int digit;
		if(n==0)
		{
			System.out.println(1);
		}
		else
		{	
			int p=1;
			int newnum=0;
			while(x>0)
			{
				digit=x%10;
				if(digit==0)
				{
					digit=1;
				}
				newnum+=digit*p;
				p*=10;
				x/=10;
			}
			System.out.println("After replacing all 0's with 1 : \n"+newnum);
		}
	}
}