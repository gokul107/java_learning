class Reverse
{
	public static void main(String[] args) 
	{
		String str="hello";

		StringBuffer sb=new StringBuffer(str);

		String revStr=sb.reverse().toString();

		System.out.println(revStr);
	}
}