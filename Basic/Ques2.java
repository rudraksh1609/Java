import java.util.Scanner;
public class Ques2 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name:");
        String name = sc.nextLine();
        System.out.println("Enter Roll No.:");
        int rollno = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Department:");
        String dept = sc.nextLine();       
        System.out.println("Enter the marks in 5 subjects out of 100");
        int[] m = new int[5];
        for (int i = 0; i < 5; i++) 
        {
            m[i] = sc.nextInt();
        }
        int totalMarks = 0;
        for (int i = 0; i < 5; i++) 
        {
            totalMarks = totalMarks + m[i];
        }
        int percentage = totalMarks / 5;
        System.out.println("Student Details are as Follows:");
        System.out.println("Name: " + name);
        System.out.println("Roll NO.: " + rollno);
        System.out.println("Department: " + dept);
        System.out.println("Marks of 5 subjects:");
        for (int i = 0; i < 5; i++) 
        {
            System.out.println(m[i]);
        }
        System.out.println("Percentage is: " + percentage+"%");
    }
}