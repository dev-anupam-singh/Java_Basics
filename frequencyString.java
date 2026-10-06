public class frequencyString {
    public static void main(String[] args) {
        String name = "programming";
        int rCount = 0;
        int mCount = 0;
        int nCount =0;

        for(int i=0;i<name.length();i++){
            char ch = name.charAt(i);

            if (ch == 'r') {
                rCount++;

                
            }
            if (ch == 'm') {
                mCount++;
                
            }
            if (ch == 'n') {
                nCount++;
                
            }
        }
        System.out.println(rCount);
        System.out.println(mCount);
        System.out.println(nCount);

    }
    
}
