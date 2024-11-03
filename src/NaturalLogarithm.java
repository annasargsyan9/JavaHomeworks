public class NaturalLogarithm {

    //  Write a program that takes as an input a positive integer n and computes the natural logarithm of
    // 2, by adding up to n terms in the series: 1 - 1/2 + 1/3 - 1/4 + 1/5 -... 1/n.
        public static void main(String[] args) {
            int n = 10;

            double ln2 = computeNaturalLogarithm(n);

            System.out.println("The natural logarithm of 2 using " + n + " terms is: " + ln2);
        }

        public static double computeNaturalLogarithm(int n) {
            double sum = 0.0;

            // Iterate from 1 to n and add/subtract each term to/from the sum
            for (int i = 1; i <= n; i++) {
                if (i % 2 == 0) {
                    // Subtract the term if i is even
                    sum -= 1.0 / i;
                } else {
                    // Add the term if i is odd
                    sum += 1.0 / i;
                }
            }

            return sum;
        }
    }


