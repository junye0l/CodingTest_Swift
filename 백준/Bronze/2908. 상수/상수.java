import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String A = sc.next();
        String B = sc.next();

        StringBuffer str1 = new StringBuffer(A);
        StringBuffer str2 = new StringBuffer(B);


        if(Integer.parseInt(str1.reverse().toString()) > Integer.parseInt(str2.reverse().toString())){
            System.out.println(str1);
        }else {
            System.out.println(str2);
        }
    }
}