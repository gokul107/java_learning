class  displayReverseOfAString
{
	public static void main(String[] args) 
	{
		String str="hello";

		//convert string to char array 
		char[] carr=str.toCharArray();

		String rev="";

		//reading reverse
		for(int i=carr.length-1;i>=0;i--)
		{
			rev=rev+carr[i];
		}
		System.out.println(rev);
	}
}