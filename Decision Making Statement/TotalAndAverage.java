import java.util.Scanner;
class TotalAndAverage
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 6 marks  of the student:");
        int m1=sc.nextInt();
        int m2=sc.nextInt();
        int m3=sc.nextInt();
        int m4=sc.nextInt();
        int m5=sc.nextInt();
        int m6=sc.nextInt();

        int total=m1+m2+m3+m4+m5+m6;
        float avg=(float)total/6f;
        System.out.println("total is="+total);
        System.out.println("average is ="+avg);

        if(avg>=70)
        System.out.println("grade :A grade");
        else if(avg>=50)
        System.out.println("grade :B grade");
        else if(avg>=35)
        System.out.println("grade :C grade");
        else
        System.out.println("grade :failed");
        
    }
}