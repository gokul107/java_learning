public class  AscendingOrder_Array
{
    public static void main(String[] args) 
	{
		int[] arr={5,9,1,2,7,3};

		//ascending logic
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
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
			System.out.print(i+" ");
		}
		
    }
}