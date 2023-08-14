import java.util.Scanner;
class Display_array
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array :");
		int size=sc.nextInt();

		int[] arr=new int[size];
	
	//inserting the elements
	for(int i=0;i<arr.length;i++)
	{
		System.out.println("Enter the Element:");
		arr[i]=sc.nextInt();
	}
	//reading the elements
	for(int i=0;i<arr.length;i++)
	{
		System.out.print(arr[i]+" " );
	}

	
	}

}