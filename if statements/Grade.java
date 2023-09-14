import java.util.Scanner;
class Grade
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the six marks of a student :");
        int m1=sc.nextInt();
        int m2=sc.nextInt();
        int m3=sc.nextInt();
        int m4=sc.nextInt();
        int m5=sc.nextInt();
        int m6=sc.nextInt();
        int total=m1+m2+m3+m4+m5+m6;
        float avg=(float)total/6;
        System.out.println("Total :"+total);
        System.out.println("Average :"+avg);
        if(avg>=70)
        System.out.println("Grade : A grade");
        else if(avg>=50)
        System.out.println("Grade : B grade");
        else if(avg>=35)
        System.out.println("Grade : C grade");
        else
        System.out.println("Grade : Failed");
    }
}