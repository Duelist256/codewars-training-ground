package leetcode;

public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        return !(x < 0 || (x != 0 && (x % 10) == 0)) && x == reverseNumber(x);
    }

    private static int reverseNumber(int x) {
        int number = x;
        int result = 0;
        while (number != 0) {
            result = result * 10 + (number % 10);
            number /= 10;
        }
        return result;
    }
}
