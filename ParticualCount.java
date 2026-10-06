public class ParticualCount {
    public static void main(String[] args) {
        String name = "banana";
        int aCount = 0;
        int bCount = 0;
        int nCount = 0;

        for(int i = 0;i<name.length();i++){

            char ch = name.charAt(i);
            if (ch =='a') {
                aCount++;
            }
            if (ch =='b') {
                bCount++;
                
            }else{
                nCount++;
            }

            
        }
        System.out.println(aCount);
        System.out.println(bCount);
        System.out.println(nCount);
    }
    
}
