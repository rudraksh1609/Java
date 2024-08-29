package Java1609;
import java.util.Scanner;

class Student 
{
    int rollNo;
    int age;
    String name;
    int[] marks = new int[4];
    void readInfo() 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Roll No: ");
        rollNo = scanner.nextInt();
        System.out.print("Enter Age: ");
        age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Name: ");
        name = scanner.nextLine();
        System.out.println("Enter Marks for 4 subjects:");
        for (int i = 0; i < 4; i++) 
        {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }
    }
}
interface Info 
{
    void printInfo();
}
interface Marks 
{
    void showMarks();
}
class Results extends Student implements Info, Marks 
{
    @Override
    public void printInfo() 
    {
        System.out.println("Student Information:");
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    @Override
    public void showMarks() 
    {
        System.out.println("Marks in 4 Subjects:");
        for (int i = 0; i < marks.length; i++) 
        {
            System.out.println("Subject " + (i + 1) + ": " + marks[i]);
        }
    }
}

public class Result 
{
	public static void main(String[] args) 
	{
        Results result = new Results();
        result.readInfo();
        result.printInfo();
        result.showMarks();
    }
}