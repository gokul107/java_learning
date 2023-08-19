import java.io.*;
class Methods
{
	public static void main(String[] args)throws IOException
	{
		
	BufferedWriter bw=new BufferedWriter(new FileWriter("bbb.txt"));
		bw.write(98);
		bw.newLine();

		char[] ch={'a','b','c'};
		bw.write(ch);
		bw.newLine();

		bw.write("bhaskar");
		bw.newLine();

		bw.flush();
		bw.close();
		System.out.println("Please check the location");	
	}
}
