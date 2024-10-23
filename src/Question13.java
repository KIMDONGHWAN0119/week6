public class Question13 {
    public static void main(String[] args) {
        int[][] arrs = {{1,2,3},{4,5,6},{7,8,9}};

        for(int i=0; i<3;i++){
            int sum = 0;
            for(int j=0; j<3; j++){
                sum += arrs[i][j];
            }
            System.out.print(sum + " ");
        }
        for(int i=0; i<3;i++){
            int sum = 0;
            for(int j=0; j<3; j++){
                sum += arrs[j][i];
            }
            System.out.print(sum + " ");
        }
    }
}
