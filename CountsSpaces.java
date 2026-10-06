public class CountsSpaces {
    public static void main(String[] args) {
        String name ="Anupam Raj Singh";
        int count = 0;

        for(int i = 0;i<name.length();i++){
            char ch = name.charAt(i);
            if (ch == ' ') {
                count++;
                
            }
        }
        System.out.println(count);
    }
    
}
