public class Question11 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5};
        int[] arr2 = new int[5];
        int j = 1;
        arr2[0] = arr[0];

        for(int i=1; i<arr.length; i++) {
            if(arr2[j-1] == arr[i]) {
                continue;
            }
            arr2[j] = arr[i];
            j++;
        }

        for(int i=0; i<arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }

        /* 만약 배열의 값을 모르고 전체적인 범위에 코드가 적용될라면 이중 for문을 돌린다던지 살짝 수정이 필요할 것같습니다.
        방법 1. 정렬 시키기 ( 짜여있는 알고리즘을 사용할 시 )
        방법 2. 이중 for문을 돌려 처음 대입되는 값만 집어넣기 ( Question11_2.java )
         */
    }
}
