class MyThread extends Thread 
{
	
}
class SettingAndGettingNameOfAThread
{
	public static void main(String[] args)
	{
		System.out.println(Thread.currentThread().getName());
		
		MyThread t=new MyThread();
		System.out.println(t.getName());

		Thread.currentThread().setName("Parent-Thread");
		System.out.println(Thread.currentThread().getName());

		t.setName("Child-Thread");
		System.out.println(t.getName());

	}
}