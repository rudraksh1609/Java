import java.util.Scanner;

class Student {
    private String name;
    private int rollno;
    private String dept;

    public void getData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student name: ");
        name = scanner.nextLine();
        System.out.print("Enter student roll number: ");
        rollno = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        System.out.print("Enter student department: ");
        dept = scanner.nextLine();
    }

    public void printData() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollno);
        System.out.println("Department: " + dept);
    }

    public int getRollno() {
        return rollno;
    }
}
