class DeadLock
{
	public static void main(String[] args)
	{
		final String res1="hi";
		final String res2="bye";

		Thread t1=new Thread()
		{
			public void run()
			{
				synchronized(res1)
				{
					System.out.println("Thread1: Locking Resource 1");
					synchronized(res2)
					{
						System.out.println("Thread1: Locking Resource2");
					}
				}
			}
		};

		Thread t2=new Thread()
		{
			public void run()
			{
				synchronized(res2)
				{
					System.out.println("Thread2: Locking Resource 2");
					synchronized(res1)
					{
						System.out.println("Thread1: Locking Resource 1");
					}
				}
			}
		};

		t1.start();
		t2.start();
	}
}
