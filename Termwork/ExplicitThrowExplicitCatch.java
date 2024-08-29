package Java1609;
public class ExplicitThrowExplicitCatch 
{
	public static void main(String[] args) 
	{
        try 
        {
        	// Explicit throw
            throw new RuntimeException("Explicitly thrown exception");
        } 
        catch (RuntimeException e) 
        {
        	// Explicit catch
            System.out.println("Caught a RuntimeException: " + e.getMessage());
        }
    }
}