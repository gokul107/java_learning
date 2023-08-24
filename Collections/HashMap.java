import java.util.*;
class HashMap 
{
	public static void main(String[] args) 
	{
		HashMap hm=new HashMap();
		hm.put("one","raja");
		hm.put("four","jose");
		hm.put("nine","alan");
		System.out.println(hm);
		hm.put("two",null);
		System.out.println(hm);
		hm.put(null,"gogo");
		System.out.println(hm);
		hm.put(1,10);
		System.out.println(hm);
	}
}
