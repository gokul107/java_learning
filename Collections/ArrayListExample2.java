import java.util.*;
class ArrayListExample2
{
	public static void main(String[] args)
	{
		ArrayList<String> al=new ArrayList<String>();
		al.add("one");
		al.add("two");
		al.add("three");
		System.out.println(al);//[one,two,three]
		al.add("one");
		System.out.println(al);//[one,two,three,one]
		al.add(null);
		System.out.println(al);//[one,two,three,one,null]
	}
}