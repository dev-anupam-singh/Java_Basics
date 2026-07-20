import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // outer loop 
        for(int i = 1; i<=4 ;i = i+1){
            // inner loop ->space print
            for(int j=1; j<=5-i; j++){
                System.err.print(" ");
            }
            // inner loop ->star print
            for(int j = 1; j<=i; j++){
               System.out.print("*"); 
            }
        System.out.println();
        }
    }
}