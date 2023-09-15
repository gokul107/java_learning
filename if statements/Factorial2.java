import java.util.Scanner;
class Factorial2
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number :");
        int n=sc.nextInt();

        int fact=1;
        while(n>=1)
        {
            fact*=n;
            n--;
        }
        System.out.println("Factorial of the given number is ="+fact);
    }
}