package rudra;
import java.util.*;
public class Queue1 
{
	public static void main(String[]args) 
	{
		Queue qi=new LinkedList();
		//Adding Elements to a queue
		qi.add(100);
		qi.add(200);
		qi.add(300);
		qi.add(400);
		//Adding Elements to a queue
		qi.offer(500);
		//Remove the first element
		qi.poll();
		//Clears the 
		qi.clear();
		//displays the top element
		System.out.println(qi.peek());
		System.out.println(qi);
	}
}