//user throw default catch
package Java;
import java.util.Scanner;
public class except1 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        if (age < 18) 
        {        	
            throw new ArithmeticException("Invalid Age");
        } 
        else 
        {
            System.out.println("Age is valid");
        }
    }
}