class Solution {
    String firstAlphabet(String S) {
        StringBuilder result = new StringBuilder();
        
        // Iterate through the string
        for (int i = 0; i < S.length(); i++) {
            // If the current character is the first character of a word, append it to the result
            if (i == 0 || (i > 0 && S.charAt(i - 1) == ' ')) {
                result.append(S.charAt(i));
            }
        }
        
        return result.toString();
        
    }
};
