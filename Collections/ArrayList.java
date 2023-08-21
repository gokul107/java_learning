import java.util.*;
class ArrayList
{
	public static void main(String[] args)
	{
		ArrayList al=new ArrayList();
		al.add("one");
		al.add("two");
		al.add("three");
		System.out.println(al);
		al.add("one");
		System.out.println(al);
		al.add(10);
		System.out.println(al);
		al.add(null);
		System.out.println(al);
	}
}

