import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 바구니 갯수
        int M = sc.nextInt(); // 테스트 횟수

        int[] basket = new int[N]; // 자동으로 0으로 채워짐.

        for(int m = 1; m <= M; m++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            int k = sc.nextInt();

            for (int index = i - 1; index <= j - 1; index++) {
                basket[index] = k;
            }
        }
        for(int b : basket){
            System.out.print(b + " ");
        }


    }
}