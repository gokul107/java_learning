import java.util.Scanner;
class GreatestOfThreeNumbers
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the First number :");
        int a=sc.nextInt();
        System.out.println("Enter the Second number :");
        int b=sc.nextInt();
        System.out.println("Enter the Third number :");
        int c=sc.nextInt();

        if((a>b) && (a>c))
        System.out.println(a+" is greatest");
        if((b>a) && (b>c))
        System.out.println(b+" is greatest");
        if((c>a) && (c>b))
        System.out.println(c+" is greatest");



    }
}