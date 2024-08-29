public class Student2
{
   public static void main(String[]args)
   {
	Student1 obj=new Student1();
	obj.get_Info();
	obj.show_Info();
	return;
   } 
}
class Student1
{
    private String name;
    private int age;
    private int rollno;
    private String dept;
    public void get_Info()
    {
        name="Rudraksh Agarwal";
        age=20;
        rollno=48;
        dept="CSE";
    }
    public void show_Info()
    {
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        System.out.println("Roll No.:"+rollno);
        System.out.println("Department:"+dept);
    }
}
