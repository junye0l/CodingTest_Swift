import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = 10;
        for(int t=1; t<=T; t++){
            int tc = sc.nextInt();
            Queue<Integer> q = new LinkedList<>();
            for(int i=0; i<8; i++){
                q.offer(sc.nextInt());
            }
            for(int i=1; i<=5; i++){
                int x = q.poll()-i;
                if(x<=0){
                    q.add(0);
                    break;
                } else q.add(x);
                if(i==5){
                    i=0;
                }
            }
            System.out.print("#"+tc+" ");
            for(int k : q) System.out.print(k+" ");
            System.out.println();
        }
    }
}