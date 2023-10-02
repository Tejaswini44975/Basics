class Solution 
{ 
    static List<String> splitString(String S) 
    { 
       ArrayList<String>list = new ArrayList<>();
        String S1="";
        String S2="";
        String S3="";
        for(int i=0;i<S.length();i++)
        {
         if(Character.isLetter(S.charAt(i)))
         {
          S1+=S.charAt(i);
         }
        else if(Character.isDigit(S.charAt(i)))
        {
            S2+=S.charAt(i);
        }
        else
        {
            S3+=S.charAt(i);
        }
    }
        list.add(S1);
        list.add(S2);
        list.add(S3);
       return list;
    }
} 
