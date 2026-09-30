public class OddNumber {
    static void checkNumber(int num) {
        if (num % 2 != 0) {
            throw new ArithmeticException("Number is odd!");
        }
        System.out.println("Number is even.");
    }

    public static void main(String[] args) {
        try {
            checkNumber(5);
        }
        catch (ArithmeticException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}