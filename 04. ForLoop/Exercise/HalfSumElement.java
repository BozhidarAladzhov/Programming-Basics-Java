package ForLoop.Exercise;

import java.net.Inet4Address;
import java.util.Scanner;

public class HalfSumElement {

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        int n = Integer.parseInt(scanner.nextLine()); // брой цели числа
        int max = Integer.MIN_VALUE; // определяме максимална стойност, като залагаме минималната така за начало
        int sum = 0; // определяме нулева стойност на сума

        for (int number = 1; number <= n; number++) {
            int currentNum = Integer.parseInt(scanner.nextLine());
            sum += currentNum;

            if (currentNum > max) {
                max = currentNum;
            }
        }

        int sumWhitOutMaxNumber = sum - max;

        if (max == sumWhitOutMaxNumber) {
            System.out.println("Yes");
            System.out.printf("Sum = %d", max);
        }else {
            System.out.println("No");
            int diff = Math.abs(max - sumWhitOutMaxNumber);
            System.out.printf("Diff = %d", diff);
        }



    }

}
