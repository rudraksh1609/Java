package Java1609;

public class ExplicitThrowDefaultCatch 
{
	public static void main(String[] args) 
	{
		// This will be caught by JVM
        throw new RuntimeException("Explicitly thrown exception");
    }
}
