import java.util.*;
class Vector
{
	public static void main(String[] args) 
	{
		Vector<Integer> v=new Vector<Integer>();

		System.out.println(v.capacity());

		for(int i=1;i<=10;i++)
		{
			v.addElement(i);
		}
		System.out.println(v);

		v.removeElementAt(5);
		System.out.println(v);

		System.out.println(v.firstElement());
		System.out.println(v.lastElement());

		v.removeAllElements();
		System.out.println(v);

	}
}