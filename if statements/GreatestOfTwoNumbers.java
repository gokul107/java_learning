import java.util.Scanner;
class GreatestOfTwoNumbers
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the First Number :");
        int a=sc.nextInt();

        System.out.println("Enter the Second number :");
        int b=sc.nextInt();

        if(a>b)
        System.out.println(a+" is greatest");
        if(b>a)
        System.out.println(b+" is greatest");
    }
}