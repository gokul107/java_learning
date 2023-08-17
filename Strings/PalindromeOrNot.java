class PalindromeOrNot 
{
	public static void main(String[] args) 
	{
		String str="madam";

		StringBuffer sb=new StringBuffer(str);

		String revStr=sb.reverse().toString();

		if(str.equals(revStr))
			System.out.println("It is palindrome string");
		else
			System.out.println("It is not palindrome string");
	}
}

