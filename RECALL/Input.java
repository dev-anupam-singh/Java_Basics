import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Name");
        String name = sc.nextLine();

        System.out.println("Enter Age");
        int age = sc.nextInt();

        System.out.println("My name is "+name);
        System.out.println("My age is "+age);
    }
    
}
