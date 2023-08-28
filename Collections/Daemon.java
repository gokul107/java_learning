class MyThread extends Thread 
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(Thread.currentThread().isDaemon());
			System.out.println("Child-Thread");
		}
	}
}
class Daemon
{
	public static void main(String[] args)
	{
		MyThread t=new MyThread();
		t.setDaemon(true);
		t.start();
		for(int i=1;i<=5;i++)
		{
			System.out.println("Parent-Thread");
		}
	}
}

