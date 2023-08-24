import java.util.*;
class ListIteratorExample2 
{
	public static void main(String[] args) 
	{
		ArrayList al=new ArrayList();
		al.add("bala");
		al.add("nag");
		al.add("chiru");
		al.add("venki");
		System.out.println(al);

		ListIterator litr=al.listIterator();
		while(litr.hasNext())
		{
			String s=(String)litr.next();
			if(s.equals("nag"))
			{
				litr.remove();
			}
		}
		System.out.println(al);
	}
}
