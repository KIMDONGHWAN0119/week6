import java.util.Scanner;


public class Question12 {
    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 20, 25, 30};
        Scanner sc = new Scanner(System.in);
        System.out.print(" 값 입력 : ");
        int n = sc.nextInt();

        System.out.println("arr 배열 인덱스 "+ n +"의 값 : " + arr[n]);
    }
}
