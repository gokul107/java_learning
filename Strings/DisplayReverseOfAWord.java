class  DisplayReverseOfAWord
{
	public static void main(String[] args) 
	{
		String str="This Is Java Class";

		String[] sarr=str.split(" ");
		
	
		String rev="";
		//for each loop
		for(String s:sarr)
		{
			//converting string to char array
			char[] carr=s.toCharArray();

			//reading reverse
			for(int i=carr.length-1;i>=0;i--)
			{
				rev+=carr[i];
			}

			//space
			rev+=" ";
		}

		System.out.println(rev);
	}
}