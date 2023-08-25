class MyRunnable implements Runnable 
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Child-Thread");
		}
	}
}
class ByImplementingRunnableInterface
{
	public static void main(String[] args)
	{
		MyRunnable r=new MyRunnable();

		Thread t=new Thread(r); // r is a targatable interface
		
		t.start();

		for(int i=1;i<=5;i++)
		{
			System.out.println("Parent-Thread");
		}
	}
}
