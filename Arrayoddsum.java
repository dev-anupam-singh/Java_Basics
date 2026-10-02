public class Arrayoddsum {
    public static void main(String[] args) {
        int[] numbers = {15,22,9,40,17,6};
        int sum = 0;
        for(int i = 0; i<numbers.length;i++)
            if (numbers[i]%2!=0) {
                sum = sum +numbers[i];
                
            }
            System.out.println(sum);
    }
    
}
