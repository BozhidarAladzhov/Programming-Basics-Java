package FirstStepsInCodingWeek1.Exercise;

import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {

        // 1. Създаване на програма/конзола - Scanner
        Scanner scanner = new Scanner(System.in);
        // 2. Генериране на входни данни от скенер: Депозирана сума, срок на депозита(в месеци), Годишен лихвен процент
        double deposit = Double.parseDouble(scanner.nextLine());
        int termDeposit = Integer.parseInt(scanner.nextLine());
        double annualPercent = Double.parseDouble(scanner.nextLine());
        // 3. Изчиславане
        // 3.1 Натрупана лихва
        // 3.2 Лихва за 1 месец
        // 3.3 Изчиславане на сума = депозирана сума + срок на депозита * ((депозитна сума * годишен лих проц) / 12)
         double interest = deposit * (annualPercent / 100.0);
         double interestPerMonth = interest / 12;
         double Sum = deposit + termDeposit * interestPerMonth;
         // 4 Принитиране на сума
        System.out.println(Sum);

    }
}
