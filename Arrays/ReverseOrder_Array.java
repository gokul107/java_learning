class ReverseOrder_Array
{
    public static void main(String[] args)
    {
        int[] arr={1,4,3,8,2,0,9};

        //reading reverse
        for(int i=arr.length-1;i>=0;i--)
        {
            System.out.print(arr[i]+" ");
        }
    }
}