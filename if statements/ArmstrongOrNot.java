import java.util.Scanner;
class ArmstrongOrNot
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number :");
        int n=sc.nextInt();
        int temp=n;
        int rem,sum=0;
        while(n>0)
        {
            rem=n%10;
            sum=sum+rem*rem*rem;
            n=n/10;
        }
        if(temp==sum)
        System.out.println("It is a Amstrong Number");
        else
        System.out.println("It is not a Armstrong Number");
    }
}