import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        int[] Num = new int[T];
        int Max = 0;
        double sum = 0.0;

        for (int t = 0; t < T; t++) {
            Num[t] = sc.nextInt();
            if(Num[t] > Max) {
                Max = Num[t];
            }
        }

        for(int i = 0; i < T; i++){
            sum += ((double)Num[i]/Max) * 100;
        }

        System.out.println(sum / T);
    }
}