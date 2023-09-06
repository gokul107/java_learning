class Duplicates
{
    public static void main(String[] args)
    {
        String str="google";

        String Characters="";
        String duplicates="";

        for(int i=0;i<str.length();i++)
        {
            String current=Character.toString(str.charAt(i));

            if(Characters.contains(current))
            {
                if(!duplicates.contains(current))
                {
                    duplicates+=current;
                continue;
                }
            }
            Characters+=current;
        }
        System.out.println(duplicates);
    }
}