package ConditionalStatementsWeek2.Exercise;

import javax.swing.*;
import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int statists = Integer.parseInt(scanner.nextLine());
        double cloths = Double.parseDouble(scanner.nextLine());

        //декор = 10% от стойноста на бюджета
        double decor = budget * 0.1;
        double sumCloths = cloths * statists;
        // над 150 статиста има 10% отстъпка
        if (statists >= 150) {
            sumCloths = sumCloths - (sumCloths * 0.1);
        }

        double expenses = sumCloths + decor;

        if (expenses > budget) {
            System.out.println("Not enough money!");
            System. out.printf("Wingard needs %.2f leva more.",expenses-budget);
        }else {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", budget-expenses);
        }
    }
}
