import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();

        for (int i = 1; i < M; i++) {
            int sum = i;
            int temp = i;

            while (temp > 0) {
                sum += temp % 10;
                temp /= 10;
            }

            if (sum == M) {
                System.out.println(i);
                return;
            }
        }

        System.out.println(0); // 생성자 없음
    }
}