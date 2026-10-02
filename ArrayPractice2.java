public class Arraypractice2 {
    public static void main(String[] args) {
        int [] numbers = {10,25,14,33,40,17,22};
        int EvenSum = 0;
        int OddSum = 0;
        int EvenCount = 0;
        int OddCount =0;

        for(int i = 0;i<numbers.length;i++){
            if (numbers[i]%2==0) {
                EvenSum = EvenSum + numbers[i];
                EvenCount++;
            }else{
                OddSum = OddSum + numbers[i];
                OddCount++;
                    
            }
        }
        System.out.println(EvenSum);
        System.out.println(OddSum);
        System.out.println(EvenCount);
        System.out.println(OddCount );
    }
}

