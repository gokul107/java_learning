class MyThread extends Thread
{

}
class  Case4
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
