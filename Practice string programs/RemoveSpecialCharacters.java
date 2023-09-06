class  RemoveSpecialCharacters
{
    public static void main(String[] args)
    {
        String str="I$hub@Tale_nT#";
        str=str.replaceAll("[^A-Za-z0-9]","");
        System.out.println(str);
    }
}