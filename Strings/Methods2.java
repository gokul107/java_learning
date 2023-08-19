import java.io.*;
class Methods2
{
	public static void main(String[] args)throws IOException
	{
		PrintWriter pw=new PrintWriter("ccc.txt");

		pw.write(100);
		pw.println(100);
		pw.print('a');
		pw.println(true);
		pw.println("hi");
		pw.println(10.5d);

		pw.flush();
		pw.close();
		System.out.println("Please check the location");
	}
}
