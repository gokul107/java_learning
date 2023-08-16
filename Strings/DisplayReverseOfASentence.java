class  DisplayReverseOfASentence
{
	public static void main(String[] args) 
	{
		String str="This Is Java Class";

		String[] sarr=str.split(" ");

		//reading reverse
		String rev="";

		for(int i=sarr.length-1;i>=0;i--)
		{
			rev+=sarr[i]+" ";
		}

		System.out.println(rev);
	}
}
