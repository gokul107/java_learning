class TryBlockWithMultipleCatchBlocks
{
	public static void main(String[] args)
	{
		try
		{
			System.out.println(10/0);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("From ae");
		}
		catch(RuntimeException re)
		{
			System.out.println("From re");
		}
		catch(Exception e)
		{
			System.out.println("From e");
		}
	}
}
