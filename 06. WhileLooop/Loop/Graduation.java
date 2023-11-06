package WhileLooopWeek5.Loop;

import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameStudent = scanner.nextLine();

        int grade = 1;
        int missGrade = 0;
        double sumEvaluation = 0.0;

        while (grade <= 12) {
                double evaluation = Double.parseDouble(scanner.nextLine());
                if (evaluation >= 4){
                    grade++;
                }else {
                    missGrade ++;
                }

                if (missGrade == 2){
                    System.out.printf("%s has been excluded at %d grade",nameStudent,grade);
                    break;
                }

            sumEvaluation = sumEvaluation + evaluation;

        }

        if (grade == 13){
            double finalEvaluation = sumEvaluation / 12;
            System.out.printf("%s graduated. Average grade: %.2f",nameStudent,finalEvaluation);
        }

    }
}
