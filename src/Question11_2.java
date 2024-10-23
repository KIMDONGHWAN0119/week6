public class Question11_2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5};
        int[] arr2 = new int[5];
        int j = 1;
        arr2[0] = arr[0];

        for(int i=1;i<arr.length;i++){
            for(int k=0;k<j;k++){ // 0 < 1 1번;
                if(arr2[k] == arr[i]){
                    break;
                }else if(k == (j-1) && arr2[k] != arr[i]){
                    arr2[j] = arr[i];
                    j++;
                }
            }
        }
        for(int i=0;i<arr2.length;i++){
            System.out.print(arr2[i]+" ");
        }
    }
}
