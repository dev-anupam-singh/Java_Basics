public class ArrayPractice {
    public static void main(String[] args) {
        int [] numbers = {12,7,25,8,30,11};
        int sum = 0;
        int largest = numbers[0];
        int smallest = numbers[0];
        int count = 0;
        //sum
        for(int i = 0;i<numbers.length;i++){
            sum = sum + numbers[i];
        }
        //largest
        for(int i = 0;i<numbers.length;i++){
            if (numbers[i]>largest) {
                largest = numbers[i];
                
            }
        }
        //smallest
        for(int i = 0;i<numbers.length;i++){
            if (numbers[i]<smallest) {
                smallest= numbers [i];
                
            }
        }
        //Even count
        for(int i = 0;i<numbers.length;i++){
            if (numbers[i]%2==0) {
                count++;
                
            }
        }
        
        System.out.println(sum);
        System.out.println(largest);
        System.out.println(smallest);
        System.out.println(count);
    }
    
}
