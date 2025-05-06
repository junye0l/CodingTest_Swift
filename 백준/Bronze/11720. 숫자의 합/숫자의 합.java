import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int sum = 0;

        int T = sc.nextInt();
        String N = sc.next();

        for(int i = 0; i < N.length(); i++){
            sum += Integer.parseInt(String.valueOf(N.charAt(i)));
        }
        System.out.println(sum);
    }
}