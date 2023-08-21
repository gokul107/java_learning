import java.util.Scanner;

class TooYoungException extends RuntimeException
{
	TooYoungException(String s)
	{
		super(s);
	}
}
class TooOldException extends RuntimeException
{
	TooOldException(String s)
	{
		super(s);
	}
}
class Exception
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Age : ");
		int age=sc.nextInt();

		if(age<18)
			throw new TooYoungException("U r not eligible to vote");
		else
			throw new TooOldException("U r eligible to vote");
	}
}