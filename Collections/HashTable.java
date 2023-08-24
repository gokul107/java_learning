import java.util.*;
class Hashtable
{
	public static void main(String[] args) 
	{
		Hashtable<Integer,String> ht=new Hashtable<Integer,String>();
		ht.put(1,"one");
		ht.put(10,"ten");
		ht.put(7,"seven");
		ht.put(3,"three");
		System.out.println(ht);
		ht.put(1,"jojo");
		System.out.println(ht);
		
		ht.put(5,null);
		System.out.println(ht); // R.E NullPointerException

		ht.put(null,"five");
		System.out.println(ht);//R.E NullPointerException
		

	}
}
