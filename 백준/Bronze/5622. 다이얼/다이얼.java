import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String[] words = {"ABC","DEF","GHI","JKL","MNO","PQRS","TUV","WXYZ"};
        int sum = 0;

        for(int i = 0; i < s.length(); i++){
            for(int j = 0; j < words.length; j++){
                if(words[j].contains(String.valueOf(s.charAt(i)))) {
                    sum += j + 3;
                }
            }
        }

        System.out.println(sum);

    }
}