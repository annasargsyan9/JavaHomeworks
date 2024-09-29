public class ReverseArrayRecursive {
    //6. Given an array, write a function to print the elements of the given array in reversed order. Use recursion.
    public static void printReverse(int[] arr, int n) {
        if (n == 0) {
            return;
        }
        System.out.print(arr[n - 1] + " ");
        printReverse(arr, n - 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;

        System.out.print("Array in reverse order: ");
        printReverse(arr, n);
    }
}

