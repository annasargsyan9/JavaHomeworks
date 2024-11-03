package ArithmeticOperationsProgram;

import java.util.Arrays;

public class ArithmeticDemo {

    public static void main(String[] args) {
        System.out.println("Max of 3, 7, 5: " + ArithmeticOperations.max3(3, 7, 5));
        System.out.println("Max of 4.5, 6.1, 5.3: " + ArithmeticOperations.max3(4.5, 6.1, 5.3));

        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};
        System.out.println("Arrays equal: " + ArithmeticOperations.eq(arr1, arr2));

        System.out.println("Are 3.0, 4.0, 5.0 sides of a triangle? " + ArithmeticOperations.areTriangular(3.0, 4.0, 5.0));

        double[] arr = {1.0, 2.0, 5.0, 10.0};
        ArithmeticOperations.rescale(arr);
        System.out.println("Rescaled array: " + Arrays.toString(arr));

        boolean[] boolArr = {false, false, true};
        System.out.println("Any true in boolean array: " + ArithmeticOperations.any(boolArr));
    }
}
