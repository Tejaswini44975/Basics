//leetcode
class Solution {
    public int gcd(int a, int b)
    {
        
        if(b>a)
        {
            return gcd(b,a);
        }
        if(b==0)
        {
            return a;
        }
        return gcd(b,a%b);
    }
    public int findGCD(int[] nums) {
       Arrays.sort(nums);
       int min,max;
       min=nums[0];
       max=nums[nums.length-1];
       return gcd(max,min);

    }
}