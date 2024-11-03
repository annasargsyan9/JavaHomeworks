// Write a program that finds all combinations of four elements of a given integer array,
//        whose sum is equal to the given value.
import java.util.Arrays;

public class Array3 {

    public static void main(String[] args) {
        int[] array = {1, 0, -1, 0, -2, 2};  // Input array
        int target = 0;  // Target sum

        findAndPrintFourSum(array, target);
    }

    public static void findAndPrintFourSum(int[] array, int target) {
        int n = array.length;

        Arrays.sort(array);

        for (int i = 0; i < n - 3; i++) {
            if (i > 0 && array[i] == array[i - 1]) continue;

            for (int j = i + 1; j < n - 2; j++) {
                if (j > i + 1 && array[j] == array[j - 1]) continue;

                int left = j + 1;
                int right = n - 1;

                while (left < right) {
                    int sum = array[i] + array[j] + array[left] + array[right];

                    if (sum == target) {
                        System.out.println("[" + array[i] + ", " + array[j] + ", " + array[left] + ", " + array[right] + "]");

                        while (left < right && array[left] == array[left + 1]) left++;
                        while (left < right && array[right] == array[right - 1]) right--;

                        left++;
                        right--;
                    } else if (sum < target) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }
    }
}
