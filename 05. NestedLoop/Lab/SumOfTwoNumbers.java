package NestedLoopWeek6.Lab;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine()); // начало на интервал
        int num2 = Integer.parseInt(scanner.nextLine()); // край на интеревал
        int magicNum = Integer.parseInt(scanner.nextLine()); // магическо число
        int counter = 0;
        int sum =0;


        for (int i1 = num1; i1 <= num2; i1++){
            for (int i2 = num1; i2 <= num2; i2++){
                counter++;
                sum = i1 + i2;

                if (sum == magicNum){
                    System.out.printf("Combination N:%d (%d + %d = %d)",counter,i1,i2,sum);
                    break;
                }
            }
            if (sum == magicNum){
                break;
            }

        }

        if (!(sum == magicNum)){
            System.out.printf("%d combinations - neither equals %d",counter,magicNum);
        }

    }
}
