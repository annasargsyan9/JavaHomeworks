public class FibonacciSequence {
    // The Fibonacci sequence is a series of numbers where a number is the sum of previous two numbers.
    // Starting with 0 and 1, the sequence goes 0, 1, 1, 2, 3, 5, 8, 13, 21, and so on. Write a program that takes as
    //  an input an  integer n and generates n numbers of Fibonacci sequence.

    public static void main(String[] args) {
        int n = 12; // You can specify the number of Fibonacci numbers to generate directly here

        generateFibonacci(n);
    }

    public static void generateFibonacci(int n) {
        int first = 0, second = 1;
        System.out.print(first + " " + second);

        // Generate and print the next n- 2 Fibonacci numbers
        for (int i = 3; i <= n; i++) {
            int next = first + second;  // The next number is the sum of the previous two
            System.out.print(" " + next);

            // Update the first and second numbers for the next iteration
            first = second;
            second = next;
        }

        System.out.println();  // Print a newline at the end
    }
}
