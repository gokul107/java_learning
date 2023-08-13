class Zero_Argument_Constructor 
{
	public Test()
	{
		System.out.println("0-arg const");
	}
	public static void main(String[] args) 
	{
		System.out.println("Main method");
		Test t=new Test();
	}
}
