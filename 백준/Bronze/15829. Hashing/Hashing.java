import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int r = 31;
        final int M = 1234567891;

        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt(); // 문자열 길이
        String str = sc.next();

        long hash = 0;
        long pow = 1;

        for (int i = 0; i < L; i++) {
            int charValue = str.charAt(i) - 'a' + 1;
            hash = (hash + charValue * pow) % M;
            pow = (pow * r) % M; // pow = r^i
        }

        System.out.println(hash);
    }
}