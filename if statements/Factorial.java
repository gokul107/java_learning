import java.util.Scanner;
class Factorial
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number :");
        int n=sc.nextInt();

        int fact=1;
        do
        {
            fact*=n;
            n--;
        }
        while(n>=1);
        System.out.println("Factorial of a given number is =" +fact);
    }
}