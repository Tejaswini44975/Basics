class Solution {
    void immediateSmaller(int arr[], int n)
    {
        int[] result=new int[n];
        result[n-1]=-1;
        
        for(int i=0;i<n-1;i++)
        {
            if(arr[i]>arr[i+1])
            {
                result[i]=arr[i+1];
            }
        }
         for (int i = 0; i < n; i++) 
         {
        System.out.print(result[i] + " ");
         }
    }
   public static void main(String[] args)
  {
        int[] arr1 = {4, 2, 1, 5, 3};
        int n1 = arr1.length;

        Solution sol1 = new Solution();
        sol1.immediateSmaller(arr1, n1);

        System.out.print("Output for Example 1: ");
        for (int i = 0; i < n1; ++i) 
        {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
}
