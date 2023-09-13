import java.util.Scanner;
class Vote
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Age :");
        int age=sc.nextInt();
        
        if(age>=18)
        System.out.println("U r eligible to vote");
        else
        System.out.println("U r not eligible to vote");
    }
}