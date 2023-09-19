class Solution {
    
    void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
        int start = 0;
        while (start < n) {
            int end = Math.min(start + k - 1, n - 1);
            
            // Reverse the sub-array from start to end.
            while (start < end) {
                int temp = arr.get(start);
                arr.set(start, arr.get(end));
                arr.set(end, temp);
                start++;
                end--;
            }
            
            start += k;
        }
    }
}