import java.nio.charset.StandardCharsets;
import java.util.Scanner;
//1)Count Characters in a String
//Description: Write a program that reads a string from the user and prints the total number of
// characters in that string.
//Example:
//Input: "Hello"
//Output: The string has 5 characters.
    public class CountCharacters {
        public static void main(String[] args) {
            System.out.println("enter some text");
            Scanner scanner = new Scanner(System.in);
            String scanner1 = scanner.next();
            int count = scanner1.length();
            System.out.println("The string has  " + count + " characters.");


//2)Print Each Character on a New Line Description: Write a program that takes a string as input and prints each
            // character of the string on a new line.
            //Example:
            //  Input: "Hello"'
            //  Output:
            //H
            //e
            //l
            //l
            //o
            System.out.println("Enter a string");
            Scanner scanner2 = new Scanner(System.in);
            String input = scanner2.nextLine();
            for (int i = 0; i < input.length(); i++) {
                System.out.println(input.charAt(i));

            }
            scanner.close();
        }
    }


