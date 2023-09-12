com.ihub.www;
import java.util.Scanner;
public class Sum
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number :" );
         int a = sc.nextInt();
          System.out.print("Enter the second number :" );
         int b = sc.nextInt();
         System.out.println("sum of two numbers is "+sum(a,b));

    }
    public static int sum(int a,int b)
    {
      if(a==0)
      {
      return b;
      }
      return sum(--a,++b);
    }
}