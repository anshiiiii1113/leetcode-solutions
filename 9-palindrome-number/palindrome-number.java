class Solution {
    public boolean isPalindrome(int x) {
        // Negative numbers are not palindromes
        if (x < 0) {
            return false;
        }

        int original = x;
        int rev = 0;

        while (x > 0) {
            int remainder = x % 10;      // Get the last digit
            rev = rev * 10 + remainder;  // Build the reversed number
            x = x / 10;                  // Remove the last digit
        }

        return original == rev;
    }
}