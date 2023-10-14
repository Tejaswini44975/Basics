class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int counter = 0;
        for (int i = 0; i < items.size(); i++)
         {

            if (ruleKey.equals("type"))
            {
                if (ruleValue.equals(items.get(i).get(0))) ++counter;

            } 
            else if (ruleKey.equals("color"))
            {
                if (ruleValue.equals(items.get(i).get(1))) ++counter;

            } 
            else if (ruleKey.equals("name")) 
            {
                if (ruleValue.equals(items.get(i).get(2))) ++counter;
            }
        }
        return counter;
        
    }
}