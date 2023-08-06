import java.util.Scanner;
class Options
{
    public static void main(String[] args)
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the option :");
    int option=sc.nextInt();

    if(option==100)
    System.out.println("It is a police number");
    else if(option==108)
    System.out.println("It is a Emergency number");
    else if(option==101)
    System.out.println("it is a fire engine number");
    else
    System.out.println("It is a invalid option");
    }
}