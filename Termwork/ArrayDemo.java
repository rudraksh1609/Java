package Java1609;
import java.util.Arrays;
public class ArrayDemo 
{
	void arrayFunc(int[] arr, int target) 
    {
        System.out.println("Pairs of elements whose sum is " + target + " are:");
        boolean found = false;
        for (int i = 0; i < arr.length; i++) 
        {
            for (int j = i + 1; j < arr.length; j++) 
            {
                if (arr[i] + arr[j] == target) 
                {
                    System.out.println(arr[i] + " + " + arr[j] + " = " + target);
                    found = true;
                }
            }
        }
        if (!found) 
        {
            System.out.println("No pairs found.");
        }
    }
    void arrayFunc(int[] A, int p, int[] B, int q) 
    {
        int[] mergedArray = new int[p + q];
        System.arraycopy(A, 0, mergedArray, 0, p);
        System.arraycopy(B, 0, mergedArray, p, q);
        Arrays.sort(mergedArray);
        System.arraycopy(mergedArray, 0, A, 0, p);
        System.arraycopy(mergedArray, p, B, 0, q);
        System.out.println("Sorted Arrays:");
        System.out.println("A: " + Arrays.toString(A));
        System.out.println("B: " + Arrays.toString(B));
    }

    public static void main(String[] args) 
    {
        ArrayDemo demo = new ArrayDemo();
        int[] numbers = {4, 6, 5, -10, 8, 5, 20};
        int target = 10;
        demo.arrayFunc(numbers, target);
        int[] A = {1, 5, 6, 7, 8, 10};
        int[] B = {2, 4, 9};
        demo.arrayFunc(A, A.length, B, B.length);
    }
}