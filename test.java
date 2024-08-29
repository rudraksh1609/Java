package Java;
// Constructor overloading
public class test 
{
	int x;
	double y,z;
	test()
	{
		System.out.println("NO ARG METHOD");
	}
	test(int x)
	{
		System.out.println("SINGLE ARG METHOD");
	}
	test(int x,int y)
	{
		System.out.println("DOUBLE INT ARG METHOD");
	}
	test(int x, double y, double z)
	{
		System.out.println("MULTI ARG METHOD");
	}
	public static void main(String[]args)
	{
		test ob=new test(10,10.5,20.5);
	}
}