class Solution {
    // function to return sum of  1, 2, ... n
    long seriesSum(int n) {
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            sum=sum+i;
        }
        return sum;
    }
}