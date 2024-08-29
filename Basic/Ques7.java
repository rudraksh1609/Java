import java.util.*;
public class Ques7 
{   
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size=sc.nextInt();
        int[] array=new int[size];
        System.out.println("Enter the elements in the array");
        for(int i=0;i<size;i++)
        {
            array[i]=sc.nextInt();
        }
        Arrays.sort(array);
        System.out.println("Rearranged and sorted array");
        for(int num:array)
        {
            System.out.print(num+" ");
        }
        sc.close();
    }
}
