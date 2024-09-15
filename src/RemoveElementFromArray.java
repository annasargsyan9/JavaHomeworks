
import java.util.Arrays;

public class RemoveElementFromArray {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};  // Original array
        int elementToRemove = 3;  // Element to remove

        // Call the function to remove the element
        int[] newArray = removeElement(array, elementToRemove);

        // Display the new array
        System.out.println("Array after removing element " + elementToRemove + ": " + Arrays.toString(newArray));
    }

    public static int[] removeElement(int[] array, int elementToRemove) {
        // Find the number of occurrences of the element to remove
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == elementToRemove) {
                count++;
            }
        }

        // Create a new array of size (original length - occurrences of the element)
        int[] newArray = new int[array.length - count];
        int index = 0;

        // Copy elements from the old array to the new array, excluding the element to remove
        for (int i = 0; i < array.length; i++) {
            if (array[i] != elementToRemove) {
                newArray[index++] = array[i];
            }
        }

        return newArray;  // Return the new array
    }
}
