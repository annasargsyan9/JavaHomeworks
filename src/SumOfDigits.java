public class SumOfDigits {
//8.Given a number n, find the  sum of its digits. Use recursion.

    // Recursive function to calculate the sum of digits of a number
    public static int sumOfDigits(int n) {
        // Base case: when the number becomes 0, return 0
        if (n == 0) {
            return 0;
        }
        // Recursive case: last digit + sum of the remaining digits
        return (n % 10) + sumOfDigits(n / 10);
    }

    public static void main(String[] args) {
        int number = 12345;
        int sum = sumOfDigits(number);
        System.out.println("Sum of digits of " + number + " is: " + sum);
    }
}

