class BufferS 
{
	public static void main(String[] args) 
	{
		StringBuffer sb=new StringBuffer();

		System.out.println(sb.capacity()); 

		sb.append("abcdeghijklmnopq");

		System.out.println(sb.capacity()); 

		sb.append("rs");

		System.out.println(sb.capacity());  

	}
}
