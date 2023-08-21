import java.util.*;
class LinkedListExample3
{
	public static void main(String[] args) 
	{
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("one");
		ll.add("two");
		ll.add("three");
		System.out.println(ll);
		ll.addFirst("gogo");
		ll.addLast("jojo");
		System.out.println(ll);
		
		System.out.println(ll.getFirst()); 
		
		System.out.println(ll.getLast()); 

		ll.removeFirst();
		ll.removeLast();
		System.out.println(ll);
		
	}
}