import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] arr = new int[T];
        int count = 0;

        for (int i = 0; i < T; i++) {
            arr[i] = sc.nextInt();
        }
        int value = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == value){
                count++;
            }
        }
        System.out.println(count);
    }
}