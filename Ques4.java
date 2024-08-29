package Java;
import java.util.*;
import java.lang.Math;
public class Ques4 
{
	public static void main(String[] args) 
	{
        Scanner sc=new Scanner(System.in);
        System.out.println("Menu:");
        System.out.println("1. Term Deposit");
        System.out.println("2. Recurring Deposit");
        System.out.println("Enter your choice:");
        int ch=sc.nextInt();
        switch (ch) 
        {
            case 1:
                System.out.println("Enter Principal Amount:");
                double p=sc.nextDouble();
                System.out.println("Enter Rate of Interest");
                double r=sc.nextDouble();
                System.out.println("Enter Time Period in years");
                double n=sc.nextDouble();
                double a=p*Math.pow(1+r/100, n);
                System.out.println("Maturing Amount:"+a);
                break;
            case 2:
                System.out.println("Enter Monthly Principal:");
                p=sc.nextDouble();
                System.out.println("Enter Rate of Interest");
                r=sc.nextDouble();
                System.out.println("Enter Time Period in Months");
                n=sc.nextDouble();
                a=p*n+(p*n*(n+1)/2)*r/100*(1/12);
                System.out.println("Maturing Amount:"+a);
                break;
            default:
                System.out.println("Invalid Choice");
                break;
        }
    }
}