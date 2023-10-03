class Solution{
    public String removeConsecutiveCharacter(String S){
       int len=S.length();
       String res="";
       for(int i=0;i<len;i++)
       {
           if(i<len-1 && S.charAt(i)==S.charAt(i+1))
           {
               continue;
           }
           else
           {
               res=res+S.charAt(i);
           }
       }
       return res;
    }
}
