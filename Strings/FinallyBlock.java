import java.io.*;
class FinallyBlock
{
	public static void main(String[] args)
	{
		FileWriter fw=null;
		try
		{
			fw=new FileWriter("xyz.txt");

			fw.write(98);

			fw.write("\n");

			fw.write("bhaskar");

			fw.flush();

			System.out.println("Please check the location");
		}
		catch (IOException ioe)
		{
			ioe.printStackTrace();
		}
		finally
		{
			try
			{
				fw.close();
			}
			catch (IOException ioe)
			{
				ioe.printStackTrace();
			}
		}
	}
}