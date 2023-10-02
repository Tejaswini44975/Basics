class GFG {
    String longest(String names[], int n) {
        if(n>0)
        {
            String longestName=names[0];
            for(int i=1;i<n;i++)
            {
                if(names[i].length()>longestName.length())
                {
                    longestName=names[i];
                }
            }
            return longestName;
        }
        return " ";
    }
}