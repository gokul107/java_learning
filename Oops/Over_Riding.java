class Parent 
{
	public void property()
	{
		System.out.println("Cash+Gold+Land");
	}
	//overridden method
	public void marry()
	{
		System.out.println("Subhalakshmi");
	}
}
class Child extends Parent
{
	//overriding method 
	public void marry()
	{
		System.out.println("Trisha");
	}
}
class Over_Riding
{
	public static void main(String[] args)
	{
		Parent p=new Parent();
		p.property(); // Cash+Gold+Land
		p.marry(); // Subhalakshmi

		Child c=new Child();
		c.property(); // Cash+Gold+Land
		c.marry(); // Trisha 

		Parent p1=new Child();
		p1.property(); // Cash+Gold+Land
		p1.marry(); // Trisha 

	}
}
