public class RemoveSpaces {
    public static void main(String[] args) {
        
        String name = "Anupam Raj Singh";
        String result = " ";

        for(int i = 0; i<name.length();i++){
            char ch = name.charAt(i);

            if (ch != ' ') {
                result = result + ch;
                
                
            }
        }
        System.out.println(result);
    }    
}
