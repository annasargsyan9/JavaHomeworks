public class DimondPattern {
    public static void main(String[] args) {


//   Write a program that takes as an input an integer number representing half of the number of rows
//   and displays diamond-like patterns. Example: Input: 3

        int n = 5; // Input: half of the number of rows in the diamond (you can change this value)

        // Upper part of the diamond (including the middle line)
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = n - 1; i >= 1; i--) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

