public class Question5 {
    public static void main(String[] args) {
        int[] numbers = {12, 3, 19, 7, 5};
        int min = numbers[0];
        for(int i=0; i<numbers.length; i++) {
            for(int j=0; j<=i; j++){
                if(min >= numbers[j]){
                    min = numbers[j];
                }
            }
        }
        System.out.println(min);
    }
}
