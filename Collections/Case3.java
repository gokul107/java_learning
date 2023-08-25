class MyThread extends Thread
{

	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("child-Thread");
		}
	}
}
class  Case3
{
	public static void main(String[] args) 
	{
		//instantiate a thread
		MyThread t=new MyThread();

		//no new thread
		t.run();

		for(int i=1;i<=5;i++)
		{
			System.out.println("parent-Thread");
		}

	}
}
