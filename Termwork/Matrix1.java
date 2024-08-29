package Java1609;
import java.util.*;
public class Matrix1 
{
	public static void main(String [] args)
	{
		int i,j,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of Matrix : ");
		int M=sc.nextInt();
		int [][] arr=new int[M][M];
		if(M<2 || M>10)
		{
			System.out.println("Invalid Size of Matrix. It should be greater than 2 less than 10");
		}
		else
		{
			System.out.println("Enter elements in the Matrix :");
			for(i=0;i<M;i++)
			{
				for(j=0;j<M;j++)
				{
					arr[i][j]=sc.nextInt();
				}
			}
			System.out.println("Original Matrix : ");
			for(i=0;i<M;i++)
			{
				for(j=0;j<M;j++)
				{
					System.out.print(arr[i][j]+" ");
				}
				System.out.println("");
			}
			for (i=0;i<M;i++) 
			{
				for (j = i + 1; j < M; j++) 
				{
	               	temp = arr[i][j];
	              	arr[i][j] = arr[j][i];
	               	arr[j][i] = temp;
	            }
	       	}
			for (i = 0; i < M; i++) 
			{
	            for (j = 0; j < M/2; j++) 
	            {
	            	temp = arr[i][j];
	                arr[i][j] = arr[i][M - 1 - j];
	                arr[i][M - 1 - j] = temp;
	            }
	        }
			System.out.println("Matrix after Rotation : ");
			for(i=0;i<M;i++)
			{
				for(j=0;j<M;j++)
				{
					System.out.print(arr[i][j]+" ");
				}
				System.out.println("");
			}
			int x= arr[0][0]+arr[0][M-1]+arr[M-1][0]+arr[M-1][M-1];
			System.out.println("Sum of corner Elements :"+x);
}
	}
}