import java.util.Scanner;
class SumOfTwoNumberWithOutThirdVariable
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        int number1=sc.nextInt();
        System.out.print("Enter the Second number");
        int number2=sc.nextInt();

        System.out.println("Sum of two number:"+(number1+number2));
    }
}