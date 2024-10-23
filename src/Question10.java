public class Question10 {
    public static void main(String[] args) {
        int[] arr = {20, 30, 50, 70, 90};
        int average = 0;
        for(int i=0; i<arr.length; i++) {
            average += arr[i];
        }
        System.out.println(average/arr.length);
    }
}
