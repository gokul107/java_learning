import java.util.Scanner;
public class StdinAndStdout
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        
        int intvalue=sc.nextInt();
        sc.nextLine();
        
        Double doublevalue=sc.nextDouble();
        sc.nextLine();
        
        String stringvalue=sc.nextLine();
        
        System.out.println("String: "+stringvalue);
        System.out.println("Double: " +doublevalue);
        System.out.println("Int: "+intvalue);
        
    }
}

