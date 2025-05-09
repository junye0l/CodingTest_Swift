import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        String sr = sc.next();

        long sum = 0;
        int r = 31;

        for(int t = 0; t < T; t++){
            int charValue = sr.charAt(t) - 'a' + 1;
            long power = 1;

            for(int i = 0; i < t; i++){
                power *= r;
            }
            sum += charValue * power;
        }

        System.out.println(sum);
    }
}