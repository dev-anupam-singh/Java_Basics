public class MiniTest {
    public static void main(String[] args) {
        String name = "Java2026 Programming";
        int letterCount = 0;
        int digitCount = 0;
        int spaceCount = 0;
        int vowelcount = 0;

        for (int i=0;i<name.length();i++){
            char ch = name.charAt(i);

            if (Character.isLetter(ch)) {
                letterCount++;

                char lower =Character.toLowerCase(ch);
                if (ch == 'a'|| ch =='i'|| ch == 'o' || ch =='e'|| ch =='u') {
                    vowelcount++;
                    
                }
                
            }else if (Character.isDigit(ch)) {
                digitCount++;
                    
            }else if (ch == ' ') {
                spaceCount++;
                    
            }
        }
        System.out.println("letters = "+letterCount);
        System.out.println("vowel = "+vowelcount);
        System.out.println("digit = "+digitCount++);
        System.out.println("Space = "+spaceCount++);
    }
    
}
