import java.util.Scanner;
public class Ques4 
{
        public static void main(String[] args) 
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Menu:");
            System.out.println("1. Term Deposit");
            System.out.println("2. Recurring Deposit");
            System.out.println("Enter your choice:");
            int ch = sc.nextInt();    
            switch (ch) 
            {
                case 1:
                    System.out.println("Enter Principal Amount:");
                    double p1 = sc.nextDouble();
                    System.out.println("Enter Rate of Interest:");
                    double r1 = sc.nextDouble();
                    System.out.println("Enter Time Period in years:");
                    double n1 = sc.nextDouble();
                    double a1 = p1 * Math.pow(1 + r1 / 100, n1);
                    System.out.println("Maturity Amount: " + a1);
                    break;       
                case 2:
                    System.out.println("Enter Monthly Principal:");
                    double p2 = sc.nextDouble();
                    System.out.println("Enter Rate of Interest:");
                    double r2 = sc.nextDouble();
                    System.out.println("Enter Time Period in Months:");
                    double n2 = sc.nextDouble();
                    double a2 = p2 * n2 + p2 * (n2 * (n2 + 1) / 2) * r2 / (100 * 12);
                    System.out.println("Maturity Amount: " + a2);
                    break;
                default:
                    System.out.println("Invalid Choice");
                    break;
            }
    }
}