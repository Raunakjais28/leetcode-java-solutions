// 16 ms | 45.9 MB

class Solution {
    public boolean isPalindrome(int x) {

        // Negative numbers are not palindrome
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int rev = 0;

        // Reverse half of the number
        while (x > rev) {
            int digit = x % 10;

            rev = rev * 10 + digit;

            x = x / 10;
        }

        // Check even and odd length numbers
        return x == rev || x == rev / 10;
    }
}
