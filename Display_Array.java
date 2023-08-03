import java.util.Scanner;
class Display_Array
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the element :");
		int size=sc.nextInt();

		int[] arr=new int[size];

		//insreting the Element
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the element :");
			arr[i]=sc.nextInt();
		}
		//reading element
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}

	}
		

}