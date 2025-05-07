import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int count = 0;

        for (int i = 0; i < N; i++) {
            String word = sc.next();
            if (isGroupWord(word)) {
                count++;
            }
        }

        System.out.println(count);
    }

    public static boolean isGroupWord(String word) {
        boolean[] visited = new boolean[26]; // 알파벳 사용 여부 체크
        char prev = 0;

        for (int i = 0; i < word.length(); i++) {
            char curr = word.charAt(i);

            if (curr != prev) {
                if (visited[curr - 'a']) {
                    return false; // 이전에 사용된 적이 있으면 그룹 단어 아님
                }
                visited[curr - 'a'] = true;
            }

            prev = curr;
        }

        return true;
    }
}