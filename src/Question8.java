import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};
        Scanner sc = new Scanner(System.in);
        int num = 0;
        System.out.println("Enter a number: ");
        num = sc.nextInt();
        for(int i=0; i<arr.length; i++) {
            if(num == arr[i]) {
                System.out.println("존재합니다");
                System.exit(0);
            }
        }
        System.out.printf("존재하지 않습니다.");
    }
}
