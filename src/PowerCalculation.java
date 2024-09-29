public class PowerCalculation {
    //4. Given integers n and k write a function that returns the value of n' . Use two different recursive approaches.
    public static int power1(int n, int k) {
        if (k == 0) {
            return 1;
        }
        return n * power1(n, k - 1);
    }

    public static int power2(int n, int k) {
        if (k == 0) {
            return 1;
        }
        if (k % 2 == 0) {
            int halfPower = power2(n, k / 2);
            return halfPower * halfPower;
        }
        else {
            return n * power2(n, k - 1);
        }
    }

    public static void main(String[] args) {
        int n = 2;  // Base
        int k = 5;  // Exponent

        System.out.println("Result using standard recursion: " + power1(n, k));

        System.out.println("Result using optimized recursion: " + power2(n, k));
    }
}

