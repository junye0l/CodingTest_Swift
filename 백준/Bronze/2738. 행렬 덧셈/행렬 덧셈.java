import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] sum = new int[N][M];
        int[][] arr1 = new int[N][M];
        int[][] arr2 = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                sum[i][j] += arr1[i][j] + arr2[i][j];
            }
        }


        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
}