import java.util.Scanner;
class vowles
{
     public static void main(String[] args)
     {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Alphabet:");
        char ch=sc.next().charAt(0);

        if(ch == 'a')
        System.out.println("it is a vowel");
        else if(ch =='e')
        System.out.println("it is avowel");
        else if(ch =='i')
        System.out.println("it is a vowel");
        else if(ch =='o')
        System.out.println("it is a vowel");
        else if(chv =='u')
        System.out.println("it is not avowel");
        else
        System.out.println("it is not a vowel");
     }
}