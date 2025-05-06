import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalPrice = sc.nextInt();
        int T = sc.nextInt();
        int sum = 0;

        for(int t = 0; t < T; t++){
            int price = sc.nextInt();
            int count = sc.nextInt();

            sum += price * count;
        }

        if(totalPrice != sum){
            System.out.println("No");
        }else {
            System.out.println("Yes");
        }
    }
}
