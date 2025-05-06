import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 바구니 갯수
        int M = sc.nextInt(); // 테스트 횟수

        int[] ball = new int[N];

        for( int i = 0; i < N; i++)
        {
            ball[i] = i+1;
        } // 1~N까지 공 채우기 순서대로

            for(int t = 1; t <= M; t++){
                int i = sc.nextInt();
                int j = sc.nextInt();

                int temp = ball[i - 1];
                ball[i - 1] = ball[j - 1];
                ball[j - 1] = temp;

            }

        for(int b: ball){
            System.out.print(b + " ");
        }

    }
}