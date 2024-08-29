package Java;
import java.util.*;
public class task6a 
{
	void arrayfunc(int[] numbers,int target)
	{
		System.out.println("Pairs of elements whose sum is "+target+" are: ");
		for(int i=0;i<numbers.length-1;i++)
		{
			for(int j=i+1;j<numbers.length;j++)
			{
				if(numbers[i]+numbers[j]==target)
				{
					System.out.println(numbers[i]+" + "+numbers[j]+" = "+target);
				}
			}
		}
	}
	
	
	void arrayfunc(int[]A,int p,int[]B,int q)
	{
		int[] result=new int[p+q];
		int i=0,j=0,k=0;
		while(i<p && j<q)
		{
			if(A[i]<B[j])
			{
				result[k++]=A[i++];
			}
			else 
			{
				result[k++]=B[j++];
			}
		}
		while(i<p)
		{
			result[k++]=A[i++];
		}
		while(j<q)
		{
			result[k++]=B[j++];
		}
		for(int x=0;x<p;x++)
		{
			A[x]=result[x];
		}
		for(int y=0;y<q;y++)
		{
			B[y]=result[p+y];
		}
		
		System.out.println("Sorted Arrays:");
		System.out.println("A: "+Arrays.toString(Arrays.copyOf(A, p)));
		System.out.println("B: "+Arrays.toString(Arrays.copyOf(B, q)));
	}
	public static void main(String[]args)
	{
		task6a demo=new task6a();
		int []numbers= {4,6,5,-10,8,5,20};
		int target=20;
		demo.arrayfunc(numbers, target);
		
		int[]A= {1,5,6,7,8,10};
		int[]B= {2,4,9};
		demo.arrayfunc(A, A.length, B, B.length);
	}
}