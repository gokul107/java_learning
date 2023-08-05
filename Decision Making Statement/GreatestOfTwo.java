import java.util.Scanner;
class GreatestOfTwo
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number :");
        int a=sc.nextInt();

        System.out.println("Enter the Second number :");
        int b=sc.nextInt();

        
      if(a<b)
      System.out.println("greatest number ="+b);
    
        if(a>b)
        System.out.println("greatest number="+a);
    }
    

    
}