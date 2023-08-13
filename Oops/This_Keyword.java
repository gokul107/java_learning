class A 
{
	int i=10;
	int j=20;
	A(int i,int j)
	{
		System.out.println(i+" "+j); //100 200
		System.out.println(this.i+" "+this.j); //10 20
	}
}
class This_Keyword
{
	public static void main(String[] args)
	{
		A a=new A(100,200);
	}
}
