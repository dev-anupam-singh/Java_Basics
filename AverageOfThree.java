import java.util.Scanner;

public class AverageOfThree {

    // 3 numbers ka average nikalne ka function
    public static double calculateAverage(double a, double b, double c) {
        return (a + b + c) / 3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Pehla number daalo: ");
        double num1 = sc.nextDouble();

        System.out.print("Doosra number daalo: ");
        double num2 = sc.nextDouble();

        System.out.print("Teesra number daalo: ");
        double num3 = sc.nextDouble();

        // Function call karke average result lena
        double avg = calculateAverage(num1, num2, num3);

        System.out.println("Average hai: " + avg);

        sc.close();
    }
}