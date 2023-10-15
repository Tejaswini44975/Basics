class Solution {
    public String restoreString(String s, int[] indices) {
        char[] str = s.toCharArray();
        char[] str2 = s.toCharArray();
        for(int i=0;i<indices.length;i++)
        {
            str2[indices[i]]=str[i];
        }
        return new String(str2);
        
    }
}