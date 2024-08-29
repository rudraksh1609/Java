package Java1609;

public class CommandLineArgument 
{
	public static void main(String[] args) 
	{
		if(args.length !=4)
		{
			System.out.println("Insufficient Arguments");
		}

		System.out.println("Name: "+args[0]);
		System.out.println("University Roll No: "+args[1]);
		System.out.println("Course: "+args[2]);
		System.out.println("Semester: "+args[3]);
	}
}
