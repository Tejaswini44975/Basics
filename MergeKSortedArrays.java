class Solution
{
    //Function to merge k sorted arrays.
    public static ArrayList<Integer> mergeKArrays(int[][] arr,int K) 
    {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<K; i++)
        {
            for(int j = 0;j<K; j++)
            {
                list.add(arr[i][j]);
            }
        }
        Collections.sort(list);
        return list;
        
    }
}
