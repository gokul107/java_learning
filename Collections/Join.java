class MyThread extends Thread 
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Child-Thread");
		}
	}
}
class Join
{
	public static void main(String[] args)throws InterruptedException
	{
		MyThread t=new MyThread();
		t.start();
		t.join();
		for(int i=1;i<=5;i++)
		{
			System.out.println("Parent-Thread");
		}
	}
}
