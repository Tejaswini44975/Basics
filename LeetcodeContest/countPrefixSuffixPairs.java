class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int count=0;
        int n=words.length;
        
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(isPrefixAndSuffix(words[i],words[j]))
                {
                    count++;
                }
            }
        }
        return count;
    }
    private boolean isPrefixAndSuffix(String str1,String str2)
    {
        int m=str1.length();
        int n=str2.length();
        
        if(m>n)
        {
            return false;
        }
        for(int i=0;i<m;i++)
        {
           if(str1.charAt(i)!=str2.charAt(i))
           {
               return false;
           }
        }
        for(int i=0;i<m;i++)
        {
            if(str1.charAt(i)!=str2.charAt(n-m+i))
            {
                return false;
            }
        }
        return true;
    }
}
