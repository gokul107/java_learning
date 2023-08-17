public class LeftToRightRotatation 
{
	public static void main(String[] args) 
	{
		String str="ihubtalent";
		int count=2;

		String substr1=str.substring(count,str.length());
		String substr2=str.substring(0,count);


		String result=substr1+substr2;
		System.out.println(result);

	}
}
