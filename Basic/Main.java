import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();
        if (n < 4) {
            System.out.println("Please enter a number greater than or equal to 4.");
            return;
        }

        Student[] students = new Student[n];
        for (int i = 0; i < n; i++) {
            students[i] = new Student();
            System.out.println("Enter details for student " + (i + 1) + ":");
            students[i].getData();
        }

        System.out.print("Enter the roll number to search: ");
        int rollToSearch = scanner.nextInt();
        boolean found = false;
        for (Student student : students) {
            if (student.getRollno() == rollToSearch) {
                found = true;
                System.out.println("Student found. Details:");
                student.printData();
                break;
            }
        }
        if (!found) {
            System.out.println("Roll number not present.");
        }
    }
}
