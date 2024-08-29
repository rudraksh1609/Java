package rudra;
import java.util.*;
public class set1 
{
	public static void main(String[]args)
	{
		//Define a set using Hash set
		Set s=new HashSet();
		//Add Elements in a set
		//unordered set
		s.add(100);
		s.add(200);
		s.add(300);
		s.add(400);
		s.add(500);
		//Print Set
		System.out.println("Hash Set");
		System.out.println(s);
		//print boolean value to check 100.. 
		//..a duplicate element can be added again or not
		System.out.println(s.add(100));
		//Adding elements in the set
		Collections.addAll(s, 50,5,10,15,20);
		System.out.println(s);
		
		//We have Linked Hash Set
		Set<Integer> lhs=new LinkedHashSet();
		System.out.println("Linked Hash Set");
		lhs.add(100);
		lhs.add(200);
		lhs.add(300);
		lhs.add(400);
		lhs.add(500);
		System.out.println(lhs);
	}
}
