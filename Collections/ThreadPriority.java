class MyThread extends Thread 
{
	
}
class ThreadPriority
{
	public static void main(String[] args)
	{
		System.out.println(Thread.currentThread().getPriority());
		
		MyThread t=new MyThread();
		System.out.println(t.getPriority());

		Thread.currentThread().setPriority(10);
		System.out.println(Thread.currentThread().getPriority());

		System.out.println(t.getPriority());

		t.setPriority(4);
		System.out.println(t.getPriority());

	}
}