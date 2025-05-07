import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double totalScore = 0.0; // 총 학점
        double totalGrade = 0.0; // (학점 * 점수)의 합

        for (int i = 0; i < 20; i++) {
            String subject = sc.next();    // 과목명 (사용 안함)
            double credit = sc.nextDouble(); // 학점
            String grade = sc.next();     // 등급

            double score = getScore(grade);

            if (score >= 0) { // P는 -1로 리턴되므로 제외됨
                totalScore += credit;
                totalGrade += credit * score;
            }
        }

        System.out.printf("%.6f\n", totalGrade / totalScore);
    }

    public static double getScore(String grade) {
        switch (grade) {
            case "A+": return 4.5;
            case "A0": return 4.0;
            case "B+": return 3.5;
            case "B0": return 3.0;
            case "C+": return 2.5;
            case "C0": return 2.0;
            case "D+": return 1.5;
            case "D0": return 1.0;
            case "F":  return 0.0;
            case "P":  return -1.0; // 제외 표시
            default:   return -1.0;
        }
    }
}