class TryAndCatch
{
	public static void main(String[] args)
	{
		try
		{
			System.out.println("stmt1");
			System.out.println(10/0);
			System.out.println("stmt2");
		}
		catch(Exception e)
		{
			System.out.println("catch-block");
		}
	}
}