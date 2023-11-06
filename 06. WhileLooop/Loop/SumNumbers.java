package WhileLooopWeek5.Loop;

import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        while (sum < number) {
            int inputNumber = Integer.parseInt(scanner.nextLine());
            sum += inputNumber;

        }

        System.out.printf("%d", sum);
    }
}
