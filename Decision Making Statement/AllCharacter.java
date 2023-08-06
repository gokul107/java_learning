import java.util.Scanner;
class AllCharacter
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Alphabet:");
        char ch=sc.next().charAt(0);

        if(ch>='A' && ch<='Z')
        System.out.println("It is uppercase letter");
        else if(ch>='a' && ch<='z')
        System.out.println("it is a lower case letter");
        else if(ch>='0' && ch<='9')
        System.out.println("it is a digit");
        else
        System.out.println("it is a special symbol");
    }
}