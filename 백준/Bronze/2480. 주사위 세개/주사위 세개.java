import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        int result = 0;

        for (int i = 0; i < 3; i++) {
            arr[i] = sc.nextInt();
        }

        if (arr[0] == arr[1] && arr[1] == arr[2]) {
            result = 10000 + (arr[0] * 1000);
        } else if (arr[0] == arr[1] || arr[0] == arr[2]) {
            result = 1000 + (arr[0] * 100);
        } else if (arr[1] == arr[2]) {
            result = 1000 + (arr[1] * 100);
        } else {
            int max = Math.max(arr[0], Math.max(arr[1], arr[2]));
            result = max * 100;
        }

        System.out.println(result);
    }
}
