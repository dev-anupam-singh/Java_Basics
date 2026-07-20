import java.util.Scanner;

public class Pattern6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // outer loop
        for(int i = 1; i<=5 ;i = i+1){
            // inner loop
            for(int j = 1; j<=i; j++){
               System.out.print(j+ " "); 
            }
        System.out.println();
        }
    }
}

