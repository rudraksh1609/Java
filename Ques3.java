package Java;
public class Ques3 
{
	public static void main(String[]args)
	{
		//Autoboxing
	    int i=10;
	    Integer k=i;
	    System.out.println("Autoboxing(Primitive int to Integer),k: "+k);
	    System.out.println(((Object)i).getClass().getPackageName());
	    
	    //Unboxing
	    Integer J= Integer.valueOf(20);
	    int j=J;
	    System.out.println("Unboxing(Integer to primitive int),j: "+j);
	    System.out.println(J.getClass().getPackageName());
	    System.out.println(J.getClass().getName());
	    System.out.println(J.getClass().getSimpleName());
	}
}
