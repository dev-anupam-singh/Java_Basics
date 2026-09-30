import java.util.Scanner;

public class Math {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));

        System.out.println("enter first number");
        int a = sc.nextInt();

        System.out.println("enter second number");
        int b = sc.nextInt();

        System.out.println("sum of a+b is :");
        int sum = a+b;
        int difference = a-b;
        int product = a*b;
        int divide = a/b;
        int avg = (a+b)/2;

        System.out.println(sum);
        System.out.println(difference);
        System.out.println(product);
        System.out.println(divide);
        System.out.println(avg);
    }
    
}
