package Java1609;
public class DefaultThrowExplicitCatch 
{
	public static void main(String[] args) 
	{
        int a = 10;
        int b = 0;
        try 
        {
        	// This will raise an ArithmeticException
            System.out.println(a / b);
        } 
        catch (ArithmeticException e) 
        {
            System.out.println("Caught an ArithmeticException: " + e.getMessage());
        }
    }
}