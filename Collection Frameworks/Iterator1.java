package rudra;
import java.util.*;
public class Iterator1 
{
	public static void main(String[]args)
	{
		//A Homogeneous List has been created 
		List list=new ArrayList();
		list.add(100);
		list.add(200);
		list.add(300);
		list.add(400);
		list.add(500);
		System.out.println(list);
		
		//Iterator
		Iterator<Integer> it=list.iterator();
		//For Homogeneous List
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		//A Heterogeneous List has been created 
		List list2=new ArrayList();
		list2.add(100);
		list2.add(2.0);
		list2.add(null);
		list2.add("graphic");
		list2.add(true);
		System.out.println(list2);
		
		//Iterator
		Iterator IT=list2.iterator();
		//For Heterogeneous List
		for(Object o:list2)
		{
			System.out.println(o);
		}
	}
}