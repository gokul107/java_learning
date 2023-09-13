import java.util.Scanner;
class OddOrNot
{
    public static void main(String[] args)
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number :");
    int n=sc.nextInt();

    if(n%2==1 || n%2!=0)
    System.out.println("It is a Odd number");
    else
    System.out.println("It is a not Odd number");
    }
}