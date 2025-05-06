import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] st = new int[31];

        for( int i = 0; i < 28; i++){
            st[sc.nextInt()]++;
        }

        for(int j = 1; j <= 30; j++){
            if(st[j] == 0){
                System.out.println(j);
            }
        }
    }
}