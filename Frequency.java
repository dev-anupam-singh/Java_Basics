public class Frequency {
    public static void main(String[] args) {
        
            String name = "mississippi";
            int count = 0;

            for (int i = 0;i<name.length();i++){
                char ch = name.charAt(i);

                if (ch == 's') {
                    count++;
                    
                }
            }
            System.out.println("s="+ count);

    }
    
}
