import java.util.Scanner;
class Palindrome
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number :");
        int n=sc.nextInt();

        int temp=n;
        int rem,rev=0;
        while(n>0)
        {
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        if(temp==rev)
        System.out.println("It is a palindrome");
        else
        System.out.println("It is not a palindrome");
    }
}