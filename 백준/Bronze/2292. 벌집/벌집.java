import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int count = 1; // 최소경로
        int range = 2; // 최소 범위

        if(N == 1){
            System.out.println(1);
        }
        else{
            while( range <= N){
                range = range +(6 * count);
                count++;
            }
            System.out.println(count);
        }
    }
}