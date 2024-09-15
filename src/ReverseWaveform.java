public class ReverseWaveform {

    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Call the function to print the 2D array in reverse waveform
        printReverseWaveform(array);
    }

    public static void printReverseWaveform(int[][] array) {
        int rows = array.length;
        int cols = array[0].length;

        // Traverse from the last row to the first row
        for (int i = rows - 1; i >= 0; i--) {
            if (i % 2 == 0) {
                // Print elements from left to right for even rows (considering zero-based index)
                for (int j = 0; j < cols; j++) {
                    System.out.print(array[i][j] + " ");
                }
            } else {
                // Print elements from right to left for odd rows
                for (int j = cols - 1; j >= 0; j--) {
                    System.out.print(array[i][j] + " ");
                }
            }
        }
    }
}
