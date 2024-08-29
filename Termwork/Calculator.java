package Java1609;
import java.util.Scanner;
class MyCalculator 
{
    public int power(int n, int p) throws Exception 
    {
        if (n < 0 || p < 0) 
        {
            throw new Exception("n and p should be non-negative");
        }
        if (n == 0 && p == 0) 
        {
            throw new Exception("n and p should not be zero");
        }
        return (int) Math.pow(n, p);
    }
}
public class Calculator 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        MyCalculator calculator = new MyCalculator();
        while (scanner.hasNextInt()) 
        {
            int n = scanner.nextInt();
            int p = scanner.nextInt();
            try 
            {
                System.out.println(calculator.power(n, p));
            } 
            catch (Exception e) 
            {
                System.out.println("java.lang.Exception: " + e.getMessage());
            }
        }
        scanner.close();
    }
}