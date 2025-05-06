import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int sum = 0;

        for(int t = 1; t <= T; t++){
            sum += t;
        }
        System.out.println(sum);
    }
}
