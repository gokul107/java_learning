class PalindromeOrNot
{
    public static void main(String[] args)
    {
        String str="madam";

        //convert string to char array
        char[] carr=str.toCharArray();

        String rev="";

        //reading rev
        for(int i=carr.length-1;i>=0;i--)
        {
            rev+=carr[i];
        }
        if(str.equals(rev))
        System.out.println("It is a Palindrome");
        else
        System.out.println("It is not a Palindrome");
    }
}