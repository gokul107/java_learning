public class RightToLeftRotatation 
{
    public static void main(String[] args) 
	{
		String str="ihubtalent";
		int count=2;

		String substr1=str.substring(0,str.length()-count);

		String substr2=str.substring(str.length()-count,str.length());

		String result=substr2+substr1;
		System.out.println(result);

	}
}
