class Solution {
    ArrayList<Integer> valueEqualToIndex(int arr[], int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==i+1)
            {
                list.add(i+1);
            }
        }
        return list;
    }
}