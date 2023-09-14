import java.util.Scanner;
class Vowels
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Alphabet :");
        char ch=sc.next().charAt(0);
        
        if(ch=='a')
        System.out.println("It is a vowel");
        else if(ch=='e')
        System.out.println("It is a vowel");
        else if(ch=='i')
        System.out.println("It is a vowel");
        else if(ch=='o')
        System.out.println("It is a vowel");
        else if(ch=='u')
        System.out.println("It is a vowel");
        else
        System.out.println("It is not a vowel");
    }
}