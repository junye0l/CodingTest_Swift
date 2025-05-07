import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        String croatia = sc.next();

        String[] target = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        for (String s : target){
            croatia = croatia.replace(s, "*");
        }
        System.out.println(croatia.length());
    }
}