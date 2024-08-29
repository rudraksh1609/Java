package Java;
import java.util.Scanner;

public class except2 
{
    public static void main(String[] args) 
    {
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age:");
        age = sc.nextInt();
        try 
        {
            if (age < 18) 
            {
                throw new ArithmeticException("Invalid age");
            } 
            else 
            {
                System.out.println("Age is valid");
            }
        } 
        catch (ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }
    }
}