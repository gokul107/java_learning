import java.util.Scanner;
class Example1
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the option :");
        int option=sc.nextInt();

        if(option==100)
        System.out.println("It is a Police Number");
        else if(option==108)
        System.out.println("It is a Ambulance number");
        else if(option==103)
        System.out.println("It is a Enquiry number ");
        else
        System.out.println("Invalid option");
    }
}