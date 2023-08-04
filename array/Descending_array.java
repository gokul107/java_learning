public class Descending_array
{
    public static void main(String[] args) 
	{
		int[] arr={5,9,1,2,7,3};

		//descending logic
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}

		//for each loop
		for(int i:arr)
		{
			System.out.print(i+" "); // 1 2 3 5 7 9
		}
		
    }
}

