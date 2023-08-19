class PalindromeOrNotByUsingRecursion
{
	public static void main(String[] args) 
	{
		int num=0;
		int original=num;
		int reverse=0;

		if(isPalindrome(num,original,reverse))
			System.out.println("It is palindrome number");
		else
			System.out.println("It is not palindrome number");
	}
	//callie method
	public static boolean isPalindrome(int num,int original,int reverse)
	{
		if(num==0)
			return original==reverse;

		reverse= reverse*10+ num%10;

		return isPalindrome(num/10,original,reverse);
	}
}
