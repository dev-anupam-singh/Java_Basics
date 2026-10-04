public class Array2dsum2 {
    public static void main(String[] args) {
        int[][] numbers = {
            {10,20,30},
            {40,50,60},
            {70,80,90}
        };

        for(int j =0;j<numbers[0].length;j++){
            int sum = 0;
            for(int i=0;i<numbers.length;i++){
                sum = sum + numbers[i][j];
            }
            System.out.println("Column"+(j+1)+ "="+sum);
        }
    }
    
}
