public class Vovelcount {
    public static void main(String[] args) {
        String name = "AnUpAm";
        int vovelCount = 0;

        for(int i =0;i<name.length();i++){
            char ch = Character.toLowerCase(name.charAt(i));

            if (ch == 'a'|| ch =='i'|| ch == 'o' || ch =='e'|| ch =='u') {
                vovelCount++;
                
            }
        }
        System.out.println("Vowels = "+ vovelCount);

    }
    
}
