    public class MethodOverloadingExample {

        public static void main(String[] args) {
            // Method calls with different parameter types
            sum("aa", "bb");  // Concatenate strings
            sum(1, 1);        // Sum integers
        }

        // Method to handle string concatenation
        public static void sum(String a, String b) {
            System.out.println(a + b);  // Concatenate and print
        }

        // Method to handle integer sum
        public static void sum(int a, int b) {
            System.out.println(a + b);  // Calculate sum and print
        }
    }

}
