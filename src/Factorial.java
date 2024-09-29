public class Factorial {

    //3. Factorial of a non-negative integer is a multiplication of all integers
    //// smaller than or equal to n. For example factorial of 6 is 6*5*4*3*2*1 which is 720.
    //// Write a function int fact(int n) that returns the factorial of n. Use recursion.

        public static int fact(int n) {
            if (n == 0 || n == 1) {
                return 1;
            }
            return n * fact(n - 1);
        }

        public static void main(String[] args) {
            int number = 6;
            int result = fact(number);
            System.out.println("Factorial of " + number + " is: " + result);



        }
    }
