import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int sum = 0;
        HashSet<Integer> set = new HashSet<>();

        for(int t = 1; t <=10; t++){
            int T = sc.nextInt();
            set.add(T%42); // 42로 나눈 나머지를 저장
        }

        System.out.println(set.size()); // 중복을 제외한 나머지의 개수를 출력.
    }
}