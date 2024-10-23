public class Question9 {
    public static void main(String[] args) {
        /*int[] arr = {1,2,3,4,5};
        int[] arr2 = arr;

        for(int i=0;i<arr2.length;i++){
            System.out.println("복사된 배열 값 : "+arr2[i]);
        }                   간단하게 해본다면 이렇게 짜겠지만 의도에 맞게 짜보겠습니다. */

        int[] arr = {1,2,3,4,5};
        int[] arr2 = new int[arr.length];

        for(int i=0;i<arr.length;i++){
            arr2[i] = arr[i];
            System.out.print(arr2[i]+" ");
        }
    }
}
