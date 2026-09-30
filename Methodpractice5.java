public class Methodpractice5 {
    static void printEven(int n){
        for (int i =1;i<=n;i++){
            if (i%2==0) {
                System.out.println(i);
                
            } else{
                System.out.print("");
            }
        }
    }
    public static void main(String[] args) {
        printEven(10);
        
    }
    
}
