import java.util.Scanner;

public class BonusHomework {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number (n): ");
        int n = sc.nextInt();

        // Edge case: 1 ya usse chote numbers prime nahi hote
        if (n <= 1) {
            System.out.println(n + " is not a prime number.");
            return; 
        }

        boolean isPrime = true;

        // 2 se lekar n-1 tak loop chalayenge checking ke liye
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                isPrime = false; // Agar divide ho gaya, toh prime nahi hai
                break; // Aage check karne ki zaroorat nahi, loop se bahar niklo
            }
        }

        // Final result print karenge flag ke basis par
        if (isPrime) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }
    }
}
