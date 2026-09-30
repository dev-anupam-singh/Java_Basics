public class ReturnIfElse {
    static String Checkeven(int n){
        if (n%2==0) {
            return "even";
            
            
        } else{
            return "odd";
        }
    }
    public static void main(String[] args) {
        String result = Checkeven(8);
        System.out.println(result);

        
    }
    
}
