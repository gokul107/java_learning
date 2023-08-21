import java.util.*;
class LinkedList 
{
	public static void main(String[] args) 
	{
		LinkedList ll=new LinkedList();
		ll.add("one");
		ll.add("two");
		ll.add("three");
		System.out.println(ll);
		ll.add("one");
		System.out.println(ll);
		ll.add(10);
		System.out.println(ll);
		ll.add(null);
		System.out.println(ll);
	}
}
