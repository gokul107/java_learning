class Gcd
{
    public static void main(String[] args)
    {
        int a=12,b=18,gcd=0;
        
        for(int i=1;a>=i || b>=i;i++)
        {
            if(a%i==0 && b%i==0)
            {
                gcd=i;
            }
        }
        System.out.println("Greatest Common Divisor is ="+gcd);
    }
}