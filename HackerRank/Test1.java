class Test1
{
	public static void main(String[] args)
	{
		//rows
		for(int i=4;i>=1;i--)
		{
			//space
			for(int j=4;j>i;j--)
			{
				System.out.print("  ");
			}
			//left side elements
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			//right side element
			for(int j=i-1;j>=1;j--)
			{
				System.out.print("* ");
			}
			//new line
			System.out.println("");
		}
		
	}
}