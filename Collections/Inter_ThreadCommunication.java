class MyThread extends Thread
{
	int total=0;
	public void run()
	{
		
		synchronized(this)
		{
				System.out.println("Child Thread started calculation");
				for(int i=1;i<=10;i++)
				{
					total=total+i;
				}
				System.out.println("Child thread giving notification");
				this.notify();
		}
	}
}
class Inter_ThreadCommunication
{
	public static void main(String[] args)throws InterruptedException
	{
		MyThread t=new MyThread();
		t.start();
		synchronized(t)
		{
			System.out.println("Main Thread waiting for updating");
			t.wait();
			System.out.println("Main -Thread got notification ");
			System.out.println(t.total);
		}
	}
}
