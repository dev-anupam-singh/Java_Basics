public class PalindromeCheck {
    public static void main(String[] args) {
        String name = "level";
        String reverse = "";
        for(int i =name.length()-1;i>=0;i--){
            reverse = reverse + name.charAt(i);
        }
        if (name.equals(reverse)) {
            System.out.println("Pallindrome");

        }else{
            System.out.println("Not a Pallindrome");
        }
        
    }
    
}
