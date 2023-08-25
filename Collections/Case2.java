class MyThread extends Thread
{
	//work of a thread
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("child-Thread");
		}
	}
}
class  Case2
{
	public static void main(String[] args) 
	{
		//instantiate a thread
		MyThread t=new MyThread();

		//start a thread
		t.start();

		for(int i=1;i<=5;i++)
		{
			System.out.println("parent-Thread");
		}

	}
}
