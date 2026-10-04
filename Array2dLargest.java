public class Array2dLargest {
    public static void main(String[] args) {
        int [][] numbers = {
            {10,45,30},
            {80,25,60},
            {15,90,40}
        };
        int largest = numbers [0][0];

        for(int i = 0;i<numbers.length;i++){
            for(int j=0;j<numbers[i].length;j++){
                if (largest<numbers[i][j]) {
                    largest = numbers[i][j];
                    
                }
            }
            
        }
        System.out.println(largest);

    }
    
}
