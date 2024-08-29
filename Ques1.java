package Java;
public class Ques1 
{
	public static void main(String[]args)
	{
		if(args.length<4)
        {
            System.out.println("Insufficient Arguments.");
            return;
        }
        String name=args[0];
        String course=args[1];
        String rollno=args[2];
        String semester=args[3];
        System.out.println("Name:"+name);
        System.out.println("Course:"+course);
        System.out.println("Univeristy Roll NO."+rollno);
        System.out.println("Semester:"+semester);
	}
}
