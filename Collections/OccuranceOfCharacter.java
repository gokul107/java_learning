import java.util.*;
class OccuranceOfCharacter
{
	public static void main(String[] args) 
	{
		String str="java";

		char[] carr=str.toCharArray();

		LinkedHashMap<Character,Integer> lhm=new LinkedHashMap<Character,Integer>();

		for(char c:carr)
		{
			if(lhm.get(c)!=null)
			{
				lhm.put(c,lhm.get(c)+1);
			}
			else
			{
				lhm.put(c,1);
			}
		}

		System.out.println(lhm);
	}
}


