public class Arrays {

    //  Write a program that finds the maximum and the minimum value of an integer array.
    public static void main(String[] args) {
        int[] numbers = {5, 11, 22, 33, 77, 8, 99, 20};
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;

        for (int number : numbers) {
            if (number < smallest) {
                smallest = number;
            }
            if (number > largest) {
                largest = number;
            }
        }
        System.out.println("The largest number is " + largest);
        System.out.println("The smalless number is " + smallest);

    }}