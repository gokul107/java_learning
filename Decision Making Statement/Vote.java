import java.util.Scanner;
class Vote
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the age :");
        int age=sc.nextInt();

        if(age>=18)
        System.out.println("U are eligible for vote");
        else
        System.out.println("U are not eligible for vote");
    }

}