public class Arrayeven {
    public static void main(String[] args) {
        int[] numbers = {5,10,15,20,25};
        int count = 0;

        for (int i = 0;i<numbers.length;i++){
            if (numbers[i]%2==0) {
                count = count + 1;
                
            }
        }
        System.out.println(count);
    }
    
}
