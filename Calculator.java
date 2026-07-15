import java.util.Scanner;
public class Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("enter first number(a):");
        int a = sc.nextInt();

        System.out.println("enter second number(b):");
        int b = sc.nextInt();

        System.out.println("Select operation:");
        System.out.println("1: + (Addition)");
        System.out.println("2: -(substractio)");
        System.out.println("3: *(multiplication)");
        System.out.println("4: /(division)");
        System.out.println("5: %(modulo/reminder)");
        System.out.println("Enter your choice(1-5)");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("result:"+(a+b));
                break;       
            case 2:
                System.out.println("result:"+(a-b));
                break;
            case 3:
                System.out.println("result:"+(a*b));
                break;
            case 4:
                if (b!=0){
                    System.out.println("result:"+(a/b));
                } else{
                    System.out.println("error: division not allowed");
                }
                break;
            case 5:
                if (b!=0){
                    System.out.println("result:"+(a%b));
                } else{
                    System.out.println("error: module by zero not allowed");
                }
                break;
            default:
                System.out.println("invalid choice ! select 1 to 5");
        }
        
        sc.close();
    }
}
    
