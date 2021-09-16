class BinarySort
{
    public static void main()
    {
        Random rd=new Random();
        int arr[]=new int[50];
        int n = 50;
        System.out.println("The array in unsorted order");
        for(int i=0;i<n;i++)
        {
            arr[i]=rd.nextInt(50);
            System.out.print(arr[i]+" ");
        }
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
        System.out.println("\nThe array in sorted order");
        for(int i:arr)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
}
