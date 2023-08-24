import java.util.*;
class OccuranceOfWords 
{
	public static void main(String[] args) 
	{
		String str="This is is java java class";

		String[] sarr=str.split(" ");

		LinkedHashMap<String,Integer> lhm=new LinkedHashMap<String,Integer>();

		for(String s:sarr)
		{
			if(lhm.get(s)!=null)
			{
				lhm.put(s,lhm.get(s)+1);
			}
			else
			{
				lhm.put(s,1);
			}
		}

		System.out.println(lhm);
	}
}
