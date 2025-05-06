import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int minute = sc.nextInt();
        sc.close();

        if( minute < 45){
            hour--;
            minute = 60 - (45 - minute);
            if(hour < 0){
                hour = 23;
            }
            System.out.printf("%d %d",hour,minute);
        }
        else {
            System.out.printf("%d %d",hour,(minute-45));
        }
    }
}

// 입력한 분 - 45 한 값이 음수이면 시간에서 -1을 하고 분 - 45 한 값을 60에서 빼주고
// 위 두개의 값을 출력해주면 될듯.