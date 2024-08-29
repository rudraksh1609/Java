import java.util.Scanner;
public class Ques5
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1=sc.nextInt();
        System.out.println("Enter the Second number:");
        int num2=sc.nextInt();
        int sum1=sum(num1);
        int sum2=sum(num2);
        if(sum1==num2 && sum2==num1)
        {
            System.out.println("Friendly Pair");
        }
        else
        {
            System.out.println("Not Friendly Pair");
        }
        sc.close();
    }
    public static int sum(int n)
    {
        int sum=0;
        for(int i=1;i<=n/2;i++)
        {
            if(n%i==0)
            {
                sum+=i;
            }
        }
        return sum;
    }
}