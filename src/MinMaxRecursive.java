public class MinMaxRecursive {
//5. Given an array, write functions to find the minimum and the maximum elements in it. Use recursion.


    public static int findMin(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        }
        return Math.min(arr[n - 1], findMin(arr, n - 1));
    }

    public static int findMax(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        }
        return Math.max(arr[n - 1], findMax(arr, n - 1));
    }

    public static void main(String[] args) {
        int[] arr = {12, 3, 19, 5, 7, 17};
        int n = arr.length;

        int min = findMin(arr, n);
        int max = findMax(arr, n);

        System.out.println("Minimum element is: " + min);
        System.out.println("Maximum element is: " + max);
    }

}
