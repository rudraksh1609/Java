package Java;
import java.util.Scanner;
class Student 
{
    private String name;
    private int rollno;
    private String dept;

    public void getData() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student name: ");
        name = sc.nextLine();
        System.out.println("Enter student roll number: ");
        rollno = sc.nextInt();
        sc.nextLine(); // Consume the newline character
        System.out.println("Enter student department: ");
        dept = sc.nextLine();
    }

    public void printData() 
    {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollno);
        System.out.println("Department: " + dept);
    }

    public int getRollno() 
    {
        return rollno;
    }
}

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int n = sc.nextInt();
        if (n < 4) 
        {
            System.out.println("Please enter a number greater than or equal to 4.");
            return;
        }

        Student[] students = new Student[n];
        for (int i = 0; i < n; i++) 
        {
            students[i] = new Student();
            System.out.println("Enter details for student " + (i + 1) + ":");
            students[i].getData();
        }

        System.out.println("Enter the roll number to search: ");
        int rollToSearch = sc.nextInt();
        boolean found = false;
        for (Student student : students) 
        {
            if (student.getRollno() == rollToSearch) 
            {
                found = true;
                System.out.println("Student found. Details:");
                student.printData();
                break;
            }
        }
        if (!found) 
        {
            System.out.println("Roll number not present.");
        }
    }
}