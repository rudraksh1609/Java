package Java;
//Implement constructor overloading and demonstrate the working of super() and this()
// Constructor overloading
class Base 
{
    Base() 
    {
        System.out.println("Base class constructor");
    }
}

public class Rudrakshagarwal extends Base 
{
    int x;
    double y, z;

    // Constructor with no arguments
    Rudrakshagarwal() 
    {
        this(0, 0.0, 0.0); // Calling another constructor in the same class
        System.out.println("Default constructor");
    }

    // Constructor with a single integer argument
    Rudrakshagarwal(int x) 
    {
        this(x, 0.0, 0.0); // Calling another constructor in the same class
        System.out.println("Constructor with a single integer argument: " + x);
    }

    // Constructor with two integer arguments
    Rudrakshagarwal(int x, int y) 
    {
        this(x); // Calling another constructor in the same class
        System.out.println("Constructor with two integer arguments: " + x + ", " + y);
    }

    // Constructor with an integer and two double arguments
    Rudrakshagarwal(int x, double y, double z) 
    {
        super(); // Calling superclass constructor
        this.x = x;
        this.y = y;
        this.z = z;
        System.out.println("Constructor with an integer and two double arguments: " + x + ", " + y + ", " + z);
    }

    public static void main(String[] args) 
    {
        // Creating an instance of the 'test' class using various constructors
    	
    	Rudrakshagarwal ob1 = new Rudrakshagarwal();
        System.out.println();

	    Rudrakshagarwal ob2 = new Rudrakshagarwal(10);
	    System.out.println();
	
	    Rudrakshagarwal ob3 = new Rudrakshagarwal(10, 20);
	    System.out.println();
	
	    Rudrakshagarwal ob4 = new Rudrakshagarwal(10, 10.5, 20.5);
	    }
}