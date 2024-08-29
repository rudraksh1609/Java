package rudra;
import java.util.*;
public class List1
{
	public static void main(String[]args) 
	{
		//List1
		List list=new ArrayList();
		//adding integer values
		list.add(200);
		list.add(100);
		list.add(10);
		list.add(200);
		list.add(140);
		//adding double value
		list.add(121.02);
		//adding string value
		list.add("graphic");
		//adding bool value
		list.add(true);
		//adding element at a particular index
		list.add(3, 15);
		//adding multiple elements together in a list
		Collections.addAll(list,0.2,0.3,0.4,0.5,"rudraksh");
		//Remove an element from an index
		list.remove(2);
		//add null as element in a list
		list.add(null);
		//Remove an element using indexOf() function
		list.remove(list.indexOf(140));
		//Remove an element using valueOf() function
		list.remove(Integer.valueOf(140));
		//Using sort functions of collections class
		Collections.sort(list);
		//Check whether the list is empty or not
		System.out.println(list.isEmpty());
		//Checking whether an elements is present in the list or not
		System.out.println(list.contains(140));
		//Print the list1
		System.out.println(list);
		
		
		//List 2
		List<Integer> list2=new ArrayList();
		//Adding Interger values in the list
		list2.add(100);
		list2.add(200);
		list2.add(300);
		list2.add(400);
		//Error Caused by Adding any other values except integer
			//list2.add("graphic");
			//list2.add(10.5);
		
		//Concatenate 2 lists return bool value
		System.out.println(list.addAll(list2));
		//Print List2
		System.out.println(list2);
		//Print the concatenated List
		System.out.println(list);
		
		//get method of a list
		System.out.println(list2.get(2));
		//Loop to print elements of a homogeneous list
		for(int i:list2)
		{
			System.out.println(i);
		}
	}
}