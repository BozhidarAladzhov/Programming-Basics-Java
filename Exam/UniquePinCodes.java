package Exam;

import java.util.Scanner;

public class UniquePinCodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxNum1 = Integer.parseInt(scanner.nextLine());
        int maxNum2 = Integer.parseInt(scanner.nextLine());
        int maxNum3 = Integer.parseInt(scanner.nextLine());

        for (int num1 = 2; num1 <= maxNum1 ; num1+=2) {
            for (int num2 = 2; num2 <=maxNum2 ; num2++) {
                for (int num3 = 2; num3 <= maxNum3 ; num3+=2) {
                    if (num2 == 2 || num2 == 3 || num2 == 5 || num2 == 7){
                        System.out.printf("%d %d %d %n", num1,num2,num3);
                    }
                }
            }
        }


    }
}
