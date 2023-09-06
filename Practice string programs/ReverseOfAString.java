class ReverseOfAString
{
    public static void main(String[] args)
    {
        String str="folder";

        //convert string to char array
        char[] carr=str.toCharArray();
        String rev="";

        //reading rev
        for(int i=carr.length-1;i>=0;i--)
        {
            rev+=carr[i];
        }
        System.out.println(rev);
    }
}