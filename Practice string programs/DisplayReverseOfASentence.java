class DisplayReverseOfASentence
{
    public static void main(String[] args)
    {
        String str="My Name Is Gokul";

        String[] sarr=str.split(" ");

        //reading rev
        String rev="";

        for(int i=sarr.length-1;i>=0;i--)
        {
            rev+=sarr[i]+" ";
        }
        System.out.println(rev);
    }
}