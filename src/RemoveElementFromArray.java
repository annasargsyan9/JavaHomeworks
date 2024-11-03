
//Write a program that removes the given element from an array.
//    Example:
//    Initial array: [1][2][3][4]
//    Remove: 2
//    Final array: [1][3][4][]
import java.util.Arrays;

public class RemoveElementFromArray {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int elementToRemove = 3;

        int[] newArray = removeElement(array, elementToRemove);

        System.out.println("Array after removing element " + elementToRemove + ": " + Arrays.toString(newArray));
    }

    public static int[] removeElement(int[] array, int elementToRemove) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == elementToRemove) {
                count++;
            }
        }

        int[] newArray = new int[array.length - count];
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] != elementToRemove) {
                newArray[index++] = array[i];
            }
        }

        return newArray;
    }
}
