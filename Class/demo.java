public class demo {
    public static void main(String[] args) {
        int num = 546;

        while (num > 0) {
            int digit = num % 10;
            System.out.println("Square of " + digit + " = " + (digit * digit));
            num = num / 10;
        }
    }
}
