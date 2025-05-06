import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 바구니 수
        int M = sc.nextInt(); // 역순 횟수

        int[] basket = new int[N];

        // 초기 바구니 상태: 1부터 N까지
        for (int i = 0; i < N; i++) {
            basket[i] = i + 1;
        }

        // M번 역순 작업
        for (int t = 0; t < M; t++) {
            int i = sc.nextInt(); // 시작 인덱스 (1-based)
            int j = sc.nextInt(); // 끝 인덱스 (1-based)

            // 인덱스를 0-based로 조정
            int left = i - 1;
            int right = j - 1;

            // 배열 역순 처리 (swap)
            while (left < right) {
                int temp = basket[left];
                basket[left] = basket[right];
                basket[right] = temp;
                left++;
                right--;
            }
        }

        // 결과 출력
        for (int n : basket) {
            System.out.print(n + " ");
        }
    }
}
