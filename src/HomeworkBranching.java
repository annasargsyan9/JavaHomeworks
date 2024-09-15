//Branching
//   Write a program that takes as an input three numbers and prints "increasing" if the numbers are in increasing order,
//   "decreasing" if the numbers are in decreasing order, and "neither" otherwise (use conditional operator).

public class HomeworkBranching {
    public static void main(String[] args) {
        //1.
        // option 1
        boolean NumIncrOrder = true;
        if (NumIncrOrder = true)
            System.out.println("increasing");
        else if (NumIncrOrder = false)
            System.out.println("decreasing");
        else
            System.out.println("neither");

        //option 2
        int num1 = 1;
        int num2 = 2;
        int num3 = 3;

        String check = (num1 < num2 && num2 < num3) ? "increasing" :
                (num1 > num2 && num2 > num3) ? "decreasing" :
                        "neither";


        System.out.println(check);

//2.
//  Write a program that takes as an input an integer representing the year and determines whether it is a leap year.
//  A leap year is exactly divisible by 4 except for century years (years ending with 00).
//  A century year is a leap year only if it is perfectly divisible by 400.

        int year = 1700;
        if (year % 400 == 0) {
            System.out.println(year + " " + "Leap Year");
        } else if (year % 100 == 0) {
            System.out.println(year + " " + "not a leap year");
        } else if (year % 4 == 0) {
            System.out.println(year + " " + "Leap Year");
        } else {
            System.out.println(year + " " + "not a leap year");
        }
//3
        // Write a program that takes as an input a character representing an operator and two integers.
        // It performs a calculation based on the numbers and the operator entered (program should use switch statement).

        char operator = '+';
        int int1 = 5;
        int int2 = 6;
        int result;
        switch (operator) {
            case '+':
                result = int1 + int2;
                System.out.println("the result is " + (result));
                break;
            case '-':
                result = int1 - int2;
                System.out.println("the result is " + (result));
                break;
            case '*':
                result = int1 * int2;
                System.out.println("the result is " + (result));
                break;
            case '/':
                result = int1 / int2;
                System.out.println("the result is " + (result));
                break;
            default:
                System.out.println("the operator is not recognized by the system");
        }
//4
//        Write a program that takes as an input the semester and the name of the program and outputs the
//        required courses based on the following table (program should use nested switch statements):
//          Fall                                      Spring
//      CS - introduction to computer science        - Object oriented programming
//      EC - English Literature                      - introduction to jurnalism


        String input1 = "Spring";
        String input2 = "CS";

        switch (input1) {
            case "Fall":
                switch (input2) {
                    case "CS":
                        System.out.println("The CS programm of the fall semester is 'Introduction to computer science'");
                        break;
                    case "EC":
                        System.out.println("The EC programm of the fall semester is 'English Literature '");
                        break;
                }

            case "Spring":
                switch (input2) {
                    case "CS":
                        System.out.println("The CS programm of the spring semester is 'Object oriented programming'");
                        break;
                    case "EC":
                        System.out.println("The EC programm of the spring semester is 'introduction to jurnalism'");
                        break;
            default:
                System.out.println("unknown semester or program");
                }

        }



    }
}

