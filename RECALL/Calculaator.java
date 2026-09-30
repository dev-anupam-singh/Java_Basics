import java.util.Scanner;

public class Calculaator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number : ");
        double a = sc.nextDouble();

        System.out.println("Enter second number : ");
        double b = sc.nextDouble();

        System.out.println("1.Addition");
        System.out.println("2. Substraction");
        System.out.println("3.Multiply");
        System.out.println("4.Divide");

        System.out.println("Enter your choice : ");

        int choice = sc.nextInt();

        if (choice==1){
            System.out.println("Result="+(a+b));
        }
        else if(choice==2){
            System.out.println("Result="+(a-b));
        }
        else if (choice==3){
            System.out.println("result="+(a*b));
        }
        else if (choice==4) {
            if (b!=0){
                System.out.println("Result="+(a/b));
                    } else {
                        System.err.println("can't devide by zero");
                        }
                         
                    }
                    else{
                        System.out.println("invalid choice");
                    }
                }
            }
    

