public class Solution {
    public static int singleNonDuplicate(ArrayList<Integer> arr) {
        int n = arr.size();
        if (n == 1)
            return arr.get(0);

        for (int i = 0; i < n; i++) {
            
            if (i == 0) 
            {
                if (!arr.get(i).equals(arr.get(i + 1)))
                    return arr.get(i);
            }
        
            else if (i == n - 1) 
            {
                if (!arr.get(i).equals(arr.get(i - 1)))
                    return arr.get(i);
            }
             else 
             {
                if (!arr.get(i).equals(arr.get(i - 1)) && !arr.get(i).equals(arr.get(i + 1)))
                    return arr.get(i);
            }
        }

        // Dummy return statement:
        return -1;
    }
}
