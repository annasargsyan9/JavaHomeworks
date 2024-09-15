//Looping
public class HomeworkLooping {
    public static void main(String[] args) {

        //1. Write a program that takes as an input a positive integer and counts the number of digits the number has.
        String[] num = {"123456"};
        String numberString = num[0];
        int count = 0;
        for (int i = 0; i < numberString.length(); i++) {
            count++;
        }
        System.out.println("The number of characters is: " + count);


        //2. Write a program which allows the user to enter as many numbers as they want and at the end
        // the program should display the largest and the smallest numbers entered.

        int[] numbers = {1, 2, 3, 56, 104};
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


        // 3. Write a do-while loop that asks the user to enter two numbers.
        // The numbers should be added and the sum should be displayed.
        // The loop should ask the user whether they wish to perform the operation again.
        // If so, the loop should repeat; otherwise the program should terminate.

        int num1 = 2;
        int num2 = 88;
        int sum = num1 + num2;

        boolean Ccontinue = false;
        boolean start = true;


        do {
            System.out.println("Enter a number.\nFirst entered number is  " + num1);
            System.out.println("Enter a number.\nSecond entered number is  " + num2);
            System.out.println("Sum of the two numbers is  " + sum);
            System.out.println("Perform the operation again?.");
            if (Ccontinue == true)
                continue;
            else {
                // Exit the loop if the user does not want to continue
                System.out.println("No");
                break;
            }
        }
        while (start == true);
        {

        }
        System.out.println("Terminated");


        // 4. Write a program that takes as an input an integer n and an integer k and calculates n
        // to the power of k  (usage of Math.pow) is not allowed.

        int n = 3;
        int k = 4;
        long result = 1;
        for (int i = 0; i < k; i++) {
            result *= n;

        }
        System.out.println(n + " to the power of " + k + " is: " + result);


        //5. Write a program that finds and prints out all Armstrong numbers between 1 and 500.
        // If the sum of cubes of each digit of the number is equal to the number itself,
        // then the number is called an Armstrong number. Example: 153 = (1*1*1) + (5*5*5)+(3*3*3)

        for (int Num = 1; Num <= 500; Num++) {
            if (isArmstrong(Num)) {
                System.out.println(Num);
            }
        }
    }

    public static boolean isArmstrong(int Num) {
        int originalNum = Num;
        int sumOfPowers = 0;
        int digitsCount = String.valueOf(Num).length();

        while (Num > 0) {
            int digit = Num % 10;
            sumOfPowers += power(digit, digitsCount);
            Num /= 10;
        }

        return sumOfPowers == originalNum;
    }

    public static int power(int base, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;




    }
}








//                Write a program that takes as an input an integer number representing half of the number of rows and displays diamond-like patterns.
//                Example:
//        Input: 3
//        Output:
//*
// **
// ****
//* * * * ***
//  ****
//  **
//
//        Arrays
//        Write a program that finds the maximum and the minimum value of an integer array.
//                Write a program that removes the given element from an array.
//        Example:
//        Initial array: [1][2][3][4]
//        Remove: 2
//        Final array: [1][3][4][]
//        Write a program that finds all combinations of four elements of a given integer array, whose sum is equal to the given value.
//
//







