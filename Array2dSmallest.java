public class Array2dSmallest {
    public static void main(String[] args) {
        int [][] numbers = {
            {25,10,40},
            {5,60,30},
            {15,20,8}
        };
        int smallest = numbers[0][0];
        for (int i = 0; i<numbers.length;i++){
            for (int j = 0; j<numbers[i].length;j++){
                if (smallest>numbers[i][j]) {
                    smallest = numbers[i][j];
                    
                }
            }
        }
        System.out.println(smallest);
    }
    
}
