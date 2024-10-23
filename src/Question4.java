public class Question4 {
    public static void main(String[] args) {
        int[] numbers = {3, 7, 2, 9, 4};
        int max = numbers[0];
        for(int i=0; i<numbers.length; i++) {
            for(int j=0; j<=i; j++){
                if(max <= numbers[j]){
                    max = numbers[j];
                }
            }
        }
        System.out.println(max);
    }
}
