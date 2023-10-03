class Solution
{
    //Function to calculate sum of all numbers present in a string.
    public static long findSum(String str)
    {
         long sum = 0;
        int currentNumber = 0;
        
        for (char ch : str.toCharArray()) {
            if (Character.isDigit(ch)) {
                // If the character is a digit, update the currentNumber
                currentNumber = currentNumber * 10 + (ch - '0');
            } else {
                // If the character is not a digit, add the currentNumber to the sum and reset it
                sum += currentNumber;
                currentNumber = 0;
            }
        }
        
        // Add the last number (if any) to the sum
        sum += currentNumber;

        return sum;
    }
    
}