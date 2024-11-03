package ArithmeticOperationsProgram;

public class ArithmeticOperations {
    public static int max3(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    public static double max3(double a, double b, double c) {
        return Math.max(a, Math.max(b, c));
    }

    public static boolean eq(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }

    public static boolean areTriangular(double a, double b, double c) {
        return a + b > c && a + c > b && b + c > a;
    }

    public static void rescale(double[] arr) {
        double min = Double.MAX_VALUE, max = Double.MIN_VALUE;
        for (double num : arr) {
            if (num < min) min = num;
            if (num > max) max = num;
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] - min) / (max - min);
        }
    }

    public static boolean any(boolean[] arr) {
        for (boolean val : arr) {
            if (val) return true;
        }
        return false;
    }

}
