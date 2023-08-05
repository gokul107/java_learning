import java.util.Scanner;
class GreatestOfThree
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number :");
        int a=sc.nextInt();

        System.out.println("Enter the Second number :");
        int b=sc.nextInt();

        System.out.println("Enter the Third number :");
        int c=sc.nextInt();

        
      if((a>b && a>c))
      System.out.println("greatest number ="+a);
    
        if((b>a && b>c))
        System.out.println("greatest number="+b);

        if((c>a && c>b))
        System.out.println("greatest number="+c);

    }
}
    

  