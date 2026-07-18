import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.print("Enter 1 to input marks or 0 to stop: ");
            choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter student's marks (out of 100): ");
                int marks = sc.nextInt();

                // Marks validation aur condition checking
                if (marks >= 90 && marks <= 100) {
                    System.out.println("This is Good");
                } else if (marks >= 60 && marks <= 89) {
                    System.out.println("This is also Good");
                } else if (marks >= 0 && marks <= 59) {
                    System.out.println("This is Good as well");
                } else {
                    System.out.println("Invalid Marks! Enter between 0 and 100.");
                }
            } else if (choice != 0) {
                System.out.println("Invalid input! Please enter either 1 or 0.");
            }

        } while (choice != 0); // Jab tak choice 0 nahi hoti, loop chalta rahega

        System.out.println("Program stopped. Keep up the effort!");
    }
}
