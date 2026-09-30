import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter your marks");
        int a = sc.nextInt();

        if (a>=90) {
            System.out.println("A");
        }
        else if (a>=75 ) {
            System.out.println("B");
            
        }
        else if (a>=60) {
            System.out.println("C");
            
        }
        else if (a>=40) {
            System.out.println("D");
            
        }
        else {
            System.out.println("F");
        }
        sc.close();
    }
    
}
