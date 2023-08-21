import java.util.*;
class LinkedListExample4
{
	public static void main(String[] args) 
	{
		LinkedList<String> ll1=new LinkedList<String>();
		ll1.add("one");
		ll1.add("two");
		ll1.add("three");
		System.out.println(ll1);

		LinkedList<String> ll2=new LinkedList<String>();
		ll2.add("raja");
		System.out.println(ll2);

		ll2.addAll(ll1);
		System.out.println(ll2);

		System.out.println(ll2.containsAll(ll1)); 

		ll2.removeAll(ll1);
		System.out.println(ll2);

	}
}