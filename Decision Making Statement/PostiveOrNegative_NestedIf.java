import java.util.Scanner;
class PostiveOrNegative_NestedIf
{
    public static void main(String[] args)
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number:");
    int n=sc.nextInt();

    if(n!=0)
    {
        if(n>0)
        {
            System.out.println("it is a +ve number");
            System.exit(0);
        }
        System.out.println("it is a -ve number ");
    }
}
}