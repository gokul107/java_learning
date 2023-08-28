class Table
{
	static synchronized void printTable(int n)
	{
	
		for(int i=1;i<=5;i++)
		{
				System.out.println(n*i);
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
class MyThread1 extends Thread
{
	
	public void run()
	{
		Table.printTable(5);
	}
}

class MyThread2 extends Thread
{

	public void run()
	{
		Table.printTable(10);
	}
}

class StaticSynchronization
{
	public static void main(String[] args)
	{
		
		MyThread1 t1=new MyThread1();
		MyThread2 t2=new MyThread2();

		t1.start();
		t2.start();
	}
}
