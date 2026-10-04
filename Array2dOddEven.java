public class Array2dOddEven {
    public static void main(String[] args) {
        int [][] numbers = {
            {10,15,22},
            {7,30,45},
            {18,9,50}
        };
        int evencount = 0;
        int oddcount = 0;
        for (int i = 0;i<numbers.length;i++){
            for(int j = 0;j<numbers[i].length;j++){
                if (numbers[i][j]%2==0) {
                    evencount++;
                    
                }else{
                    oddcount++;
                }
            }
        }
        System.out.println(evencount++);
        System.out.println(oddcount++);
    }
    
}
