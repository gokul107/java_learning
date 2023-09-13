import java.util.Scanner;
class PositiveOrNegative 
{
    public static void main(String[] args) 
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number :");
    int n=sc.nextInt();
    
    if(n==0)
    {
        System.out.println("It is not a +ve or -ve number");
        System.exit(0);
    }
    if(n>0)
    System.out.println("It is +ve number");
    else
    System.out.println("It is -ve number");
    }

}