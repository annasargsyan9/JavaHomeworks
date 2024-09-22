import java.util.Scanner;
public class StringRepetition {
//3) String Repetition
// Description: Write a program that reads a string and an integer from the user,
// then prints the string repeated that many times.
//Example:
//  Input:
//  string = "Hello"
//  times = 3
//  Output: "HelloHelloHello"
    public static void main(String[] args) {
        Scanner scanner3 = new Scanner(System.in);
        System.out.println("input some string");
        String inputString = scanner3.next();
        Scanner scanner4 = new Scanner(System.in);
        System.out.println("How many times you want it to be repeated");

        int times = scanner4.nextInt();
        for (int j = 0; j < times; j++) {
          System.out.print(inputString);
        }
    }
}
