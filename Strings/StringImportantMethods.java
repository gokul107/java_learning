class  StringImportantMethods
{
	public static void main(String[] args) 
	{
		String str="bhaskar";

		System.out.println(str.length());
		System.out.println(str.charAt(3));
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str.equals("bhaskar"));
		System.out.println(str.equalsIgnoreCase("BHASKAR"));
		System.out.println(str.indexOf('a'));
		System.out.println(str.lastIndexOf('a'));
		System.out.println(str.contains("kar"));
		System.out.println(str.concat("solution"));
	}
}
