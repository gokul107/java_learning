class StringBuffer 
{
	public static void main(String[] args) 
	{
		StringBuffer sb=new StringBuffer();

		System.out.println(sb.capacity()); //16

		sb.append("abcdeghijklmnopq");

		System.out.println(sb.capacity()); //16

		sb.append("rs");

		System.out.println(sb.capacity()); //16+1*2 =34 

	}
}
