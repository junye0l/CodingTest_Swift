import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().toUpperCase(); // 대문자로 통일

        int[] alpha = new int[26]; // A-Z

        for (int i = 0; i < input.length(); i++) {
            alpha[input.charAt(i) - 'A']++;
        }

        int max = -1;
        char result = '?';

        for (int i = 0; i < 26; i++) {
            if (alpha[i] > max) {
                max = alpha[i];
                result = (char) (i + 'A');
            } else if (alpha[i] == max) {
                result = '?';
            }
        }

        System.out.println(result);
    }
}