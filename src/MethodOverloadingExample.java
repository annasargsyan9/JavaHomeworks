    public class MethodOverloadingExample {

        public static void main(String[] args) {
            sum("aa", "bb");
            sum(1, 1);
        }

        public static void sum(String a, String b) {
            System.out.println(a + b);
        }

        public static void sum(int a, int b) {
            System.out.println(a + b);
        }
    }

