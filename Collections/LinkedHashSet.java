import java.util.*;
class  LinkedHashSet
{
	public static void main(String[] args) 
	{
		LinkedHashSet<String> lhs=new LinkedHashSet<String>();
		lhs.add("one");
		lhs.add("nine");
		lhs.add("five");
		System.out.println(lhs);
		lhs.add("one");
		System.out.println(lhs);
		lhs.add(null);
		System.out.println(lhs);
	}
}
