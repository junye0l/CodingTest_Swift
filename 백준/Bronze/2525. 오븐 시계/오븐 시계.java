import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();
        int C = sc.nextInt();

        // 총 분으로 변환
        int totalMinutes = H * 60 + M + C;

        // 시와 분으로 환산
        int newH = (totalMinutes / 60) % 24;
        int newM = totalMinutes % 60;

        System.out.printf("%d %d", newH, newM);
    }
}
