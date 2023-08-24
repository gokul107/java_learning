import java.util.*;
class HashMapExample2
{
	public static void main(String[] args) 
	{
		HashMap hm=new HashMap();
		hm.put("one","raja");
		hm.put("four","jose");
		hm.put("nine","alan");
		
		Set s=hm.keySet();
		System.out.println(s);

		Collection c=hm.values();
		System.out.println(c);

		Set s1=hm.entrySet();
		System.out.println(s1);
	}
}
