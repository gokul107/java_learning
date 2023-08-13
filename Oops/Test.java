class A
{
	public void m1()
	{
		System.out.println("m1 method");
	}
}
class B extends A 
{
	public void m2()
	{
		System.out.println("m2 method");
	}
}
class Test
{
	public static void main(String[] args)
	{
		A a=new A();
		a.m1();

		B b=new B();
		b.m1();
		b.m2();
	}
}