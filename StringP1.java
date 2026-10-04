public class StringP1 {
    public static void main(String[] args) {
        
        String name = "anupam";
        int vowelCount =0;
        int consonantCount = 0;
        for(int i = 0;i<name.length();i++){
            char ch = name.charAt(i);
            if (ch =='a'|| ch=='e'||ch=='e'||ch=='i'||ch=='o'||ch=='u')  {
                vowelCount++;
                
            }else{
                consonantCount++;
            }
        }
        System.out.println("vowel "+""+vowelCount);
        System.out.println("consonant"+""+consonantCount);
    }
    
}
