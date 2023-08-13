class MeeSeva
{
	//overloaded methods 
	public void search(int voterId)
	{
		System.out.println("Voter ID by Id number");
	}
	public void search(long aadharNo)
	{
		System.out.println("Voter ID by Aadhar card no");
	}
	public void search(String houseNo)
	{
		System.out.println("Voter ID by House No ");
	}
}
class Over_Loaded
{
	public static void main(String[] args)
	{
			MeeSeva ms=new MeeSeva();
			ms.search(1001);
			ms.search(2245l);
			ms.search("1-4/645");

	}
}
