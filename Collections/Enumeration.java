import java.util.*;
class Enumeration 
{
	public static void main(String[] args) 
	{
		Vector v=new Vector();

		for(int i=1;i<=10;i++)
		{
			v.add(i);
		}
		System.out.println(v);

		Enumeration e=v.elements();
		while(e.hasMoreElements())
		{
			Integer i=(Integer)e.nextElement();
			System.out.println(i);
		}
		

	}
}