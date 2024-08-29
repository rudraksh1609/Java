import java.util.Scanner;
public class Ques6 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size=sc.nextInt();
        int []array=new int[size];
        System.out.println("Enter the element of the array");
        for(int i=0;i<size;i++)
        {
            array[i]=sc.nextInt();
        }
        System.out.println("Enter the element to be searched:");
        int searchElement=sc.nextInt();
        boolean found=false;
        for(int element:array)
        {
            if(element==searchElement)
            {
                found=true;
                break;
            }
        }
        if(found)
        {
            System.out.println("Element found");
        }
        else
        {
            System.out.println("Element not found. Try again");
        }
        sc.close();
    }
}
