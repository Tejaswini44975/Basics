class Solution {
    static int RedOrGreen(int N, String S) {
        int redCount=0;
        int greenCount=0;
        int min=0;
        for(int i=0;i<N;i++)
        {
            if(S.charAt(i)=='R')
            {
                redCount++;
            }
            else
            {
                greenCount++;
            }
        }
        min=Math.min(redCount,greenCount);
        return min;
    }
}