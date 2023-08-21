import java.util.*;
class ArrayListExample6
{
	public static void main(String[] args)
	{
		List<String> l=new ArrayList<String>();
		l.add(new String("one"));
		l.add(new String("two"));
		l.add(new String("three"));
		System.out.println(l);//[one,two,three]
	}
}