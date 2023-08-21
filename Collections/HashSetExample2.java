import java.util.*;
class HashSetExample2
{
	public static void main(String[] args) 
	{
		HashSet<String> hs=new HashSet<String>();
		hs.add("one");
		hs.add("nine");
		hs.add("five");
		System.out.println(hs);
		hs.add("one");
		System.out.println(hs);
		hs.add(null);
		System.out.println(hs);
	}
}