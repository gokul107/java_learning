import java.util.*;
class LinkedHashMap
{
	public static void main(String[] args) 
	{
		LinkedHashMap lhm=new LinkedHashMap();
		lhm.put("one","raja");
		lhm.put("four","jose");
		lhm.put("nine","alan");
		lhm.put("one","gogo");
		System.out.println(lhm);
	}
}