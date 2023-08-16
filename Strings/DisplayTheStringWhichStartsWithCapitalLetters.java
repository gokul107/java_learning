class  DisplayTheStringWhichStartsWithCapitalLetters
{
	public static void main(String[] args) 
	{
		String str="This is Java class for Interview";

		String[] sarr=str.split(" ");

		//for each loop
		String result="";

		for(String s:sarr)
		{
			if(s.charAt(0)>='A' && s.charAt(0)<='Z')
			{
				result+=s+" ";
			}
		}
		System.out.println(result);
	}
}
