class MyThread extends Thread
{
	public void run()
	{
		System.out.println("0-arg method");
	}
	public void run(int i)
	{
		System.out.println("int-arg method");
	}
}
class  Case5
{
	public static void main(String[] args) 
	{
		//instantiate a thread
		MyThread t=new MyThread();

		t.start();

		for(int i=1;i<=5;i++)
		{
			System.out.println("parent-Thread");
		}

	}
}
