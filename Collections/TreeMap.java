import java.util.*;
class TreeMap
{
	public static void main(String[] args) 
	{
		TreeMap<Integer,String> tm=new TreeMap<Integer,String>();
		tm.put(1,"one");
		tm.put(10,"ten");
		tm.put(7,"seven");
		tm.put(3,"three");
		System.out.println(tm);
		tm.put(1,"jojo");
		System.out.println(tm);
		tm.put(5,null);
		System.out.println(tm);
		tm.put(null,"eight");
		System.out.println(tm);

	}
}
