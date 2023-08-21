import java.util.*;
class LinkedListExample2
{
	public static void main(String[] args) 
	{
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("one");
		ll.add("two");
		ll.add("three");
		System.out.println(ll);
		ll.add("one");
		System.out.println(ll);
		ll.add(null);
		System.out.println(ll);
	}
}