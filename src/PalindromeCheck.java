public class PalindromeCheck {
    //7. Given a string, write a function to check if it is palindrome or not.
    // A string is said to be palindrome if the reverse of the string is the same as string.
    // For example, "abba" is a palindrome, but "abbc" is not a palindrome. Use both recursive
    // and non-recursive methods.

    public static boolean isPalindromeRecursive(String str, int start, int end) {
        // Base case: if string has 0 or 1 character, it is a palindrome
        if (start >= end) {
            return true;
        }
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }
        return isPalindromeRecursive(str, start + 1, end - 1);
    }
    public static boolean isPalindromeIterative(String str) {
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false; // ete ka mismatch , return false
            }
            start++;
            end--;
        }
        return true; // ete bolor characters match en, it is a palindrome
    }

    public static void main(String[] args) {
        String str = "abba";

        boolean isPalindromeRec = isPalindromeRecursive(str, 0, str.length() - 1);
        System.out.println("Recursive method: Is \"" + str + "\" a palindrome? " + isPalindromeRec);

        boolean isPalindromeIter = isPalindromeIterative(str);
        System.out.println("Iterative method: Is \"" + str + "\" a palindrome? " + isPalindromeIter);
    }
}

