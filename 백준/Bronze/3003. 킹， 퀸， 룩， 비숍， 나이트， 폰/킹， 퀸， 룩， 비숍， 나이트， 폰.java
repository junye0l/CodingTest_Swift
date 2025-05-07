import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] setwhite = {1,1,2,2,2,8};
        int[] getwhite = new int[6];

        for (int i = 0; i < setwhite.length; i++){
            getwhite[i] = sc.nextInt();
            getwhite[i] = setwhite[i] - getwhite[i];
        }

        for(int i = 0; i < getwhite.length; i++){
            System.out.print(getwhite[i]+ " ");
        }
    }
}