public class CountsDigit {
    public static void main(String[] args) {
        String name ="Anupam123";
        int count = 0;
        for (int i =0; i<name.length();i++){
            char ch = name.charAt(i);
            if (Character.isDigit(ch)) {
                count++;
                
            }
        }
        System.out.println(count);
    }
    
}
