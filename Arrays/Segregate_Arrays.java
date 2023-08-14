class Segregate_Arrays
{
	public static void main(String[] args)
	{
		int[] arr={0,1,0,1,1,0,0,1,1,0};
		int[] resArr=new int[arr.length];

		int j=0;
		for(int i:arr)
		{
			if(i==0)
			{
				resArr[j++]=i;
			}
        }
			//inserting 1
			while(j<resArr.length)
			{
				resArr[j++]=1;
			}
			//display
			for(int i:resArr)
			{
				System.out.print(i+" ");
			}
		
	}

}
