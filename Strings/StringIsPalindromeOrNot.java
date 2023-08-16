class  StringIsPalindromeOrNot
{
	public static void main(String[] args) 
	{
		String str="racar";

		//convert string to char array 
		char[] carr=str.toCharArray();

		String rev="";

		//reading reverse
		for(int i=carr.length-1;i>=0;i--)
		{
			rev=rev+carr[i];
		}
		if(str.equals(rev))
			System.out.println("It is palindrome string");
		else
			System.out.println("It is not palindrome string");
	}
}