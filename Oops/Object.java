class Object
{
	public static void main(String[] args) 
	{
		Object t1=new Object();
		Object t2=new Object();
		Object t3=new Object();

		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());
		System.out.println(t3.hashCode());

		System.out.println(t1);
		System.out.println(t2.toString());
		System.out.println(t3.toString());

	}
}