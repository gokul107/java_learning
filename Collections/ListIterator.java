import java.util.*;
class ListIterator 
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
			System.out.println(s);
		}
	}
}
