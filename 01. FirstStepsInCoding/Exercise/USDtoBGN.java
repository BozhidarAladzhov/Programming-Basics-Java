package FirstStepsInCodingWeek1.Exercise;

import java.util.Scanner;

public class USDtoBGN {
    public static void main(String[] args) {
        // 1. Създаване на конзола/скенер
        Scanner scanner = new Scanner(System.in);
        // 2. Входни данни - променливи (от конзолата) - USD - double
        double USD = Double.parseDouble(scanner.nextLine());

        // 3. Вътрешни данни - променливи
        // 3.1 Курс USD/BGN (1.79549) - double
        // 3.2 Калкулация USD х курс - double
        double RateUsd = 1.79549;
        double BGN = USD * RateUsd;

        System.out.println(BGN);
    }
}
