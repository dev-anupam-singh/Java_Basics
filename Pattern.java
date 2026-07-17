import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int i = 1; i<=5 ;i = i+1){
            for(int j = 1; j<=i; j++){
               System.out.print("*"); 
            }
        System.out.println();
        }
    }
}
