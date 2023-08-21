import java.util.*;
class HashSet
{
	public static void main(String[] args) 
	{
		HashSet hs=new HashSet();
		hs.add("one");
		hs.add("nine");
		hs.add("five");
		System.out.println(hs);
		hs.add("one");
		System.out.println(hs);
		hs.add(10);
		System.out.println(hs);
		hs.add(null);
		System.out.println(hs);
	}
}