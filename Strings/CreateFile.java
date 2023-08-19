import java.io.*;
class CreateFile 
{
	public static void main(String[] args)throws IOException 
	{
		File f1=new File("cricket123");
		f1.mkdir();

		File f2=new File("cricket123","abc.txt");
		f2.createNewFile();

		System.out.println("Please check the location");

	}
}
