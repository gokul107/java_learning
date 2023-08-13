import java.util.Scanner;
class Leap_Year
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the year :");
        int year=sc.nextInt();

        //logic
        if(year%4==0)
        System.out.println("it is a leap year");
        else
        System.out.println("it is not a leap year");
    }
}