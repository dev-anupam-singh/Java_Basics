public class CountSpaces {
    public static void main(String[] args) {
        String name = "Anupam 123 Singh";
        int letters = 0;
        int digit = 0;
        int Space = 0;

        for(int i = 0; i<name.length(); i++){
            char ch = name.charAt(i);

            if (Character.isLetter(ch)) {
                letters++;
                
            } else if (Character.isDigit(ch)) {
                digit++;
                
            } else if (ch == ' ') {
                Space++;
                
            }
        }
        System.out.println("letters= " + letters);
        System.out.println("digit = " + digit);
        System.out.println("Spaces = " +  Space);
    }
    
}
