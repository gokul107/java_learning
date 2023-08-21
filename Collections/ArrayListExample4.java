import java.util.*;
class ArrayListExample4
{
	public static void main(String[] args)
	{
		ArrayList<String> al=new ArrayList<String>();
		al.add("one");
		al.add("two");
		al.add("three");
		
		for(int i=0;i<al.size();i++)
		{
			String s=al.get(i);
			System.out.println(s);
		}
		
	}
}