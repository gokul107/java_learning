class  DisplayDistinctCharacters
{
	public static void main(String[] args) 
	{
		String str="google";

		String characters="";
		String duplicates="";

		for(int i=0;i<str.length();i++)
		{
			String current=Character.toString(str.charAt(i));

			if(characters.contains(current))
			{
				if(!duplicates.contains(current))
				{
					duplicates+=current;
					continue;
				}
			}
			characters+=current;
		}

		System.out.println(characters);

	}
}
