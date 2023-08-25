class MyThread extends Thread 
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Child-Thread");
			try
			{
				Thread.sleep(2000);
			}
			catch (InterruptedException ie)
			{
				ie.printStackTrace();
			}
		}
	}
}
class Sleep
{
	public static void main(String[] args)
	{
		MyThread t=new MyThread();
		t.start();
		for(int i=1;i<=5;i++)
		{
			System.out.println("Parent-Thread");
		}
	}
}
