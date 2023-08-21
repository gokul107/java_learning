import java.util.*;
class ArrayListExample3
{
	public static void main(String[] args)
	{
		ArrayList<String> al=new ArrayList<String>();
		al.add("one");
		al.add("two");
		al.add("three");
		System.out.println(al);
		al.remove("one");
		System.out.println(al);
		al.add(0,"ten");
		System.out.println(al);

		System.out.println(al.contains("ten"));

		al.clear();
		System.out.println(al);
	}
}