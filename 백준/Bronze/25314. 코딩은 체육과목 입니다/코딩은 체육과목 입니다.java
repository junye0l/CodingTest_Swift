import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        String name = "";
        for(int t = 0; t < T/4; t++){
            name += "long" + " ";
        }

        System.out.println(name + "int");

    }
}