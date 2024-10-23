public class Question9 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] arr2 = arr;

        for(int i=0;i<arr2.length;i++){
            System.out.println("복사된 배열 값 : "+arr2[i]);
        }
    }
}
