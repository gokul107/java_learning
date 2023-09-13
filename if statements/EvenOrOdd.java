import java.util.Scanner;
class EvenOrOdd
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int n=sc.nextInt();

        if(n%2==0)
        System.out.println("It is a even number");
        else
        System.out.println("It is a Odd number");
    }
}