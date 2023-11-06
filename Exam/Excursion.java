package Exam;

import java.util.Scanner;

public class Excursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // нощувка = 20лв
        // карта за транспорт = 1.60
        // музей билет = 6

        // 25% се дбавят за непредвидени разходи

        int people = Integer.parseInt(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());
        int cards = Integer.parseInt(scanner.nextLine());
        int tickets = Integer.parseInt(scanner.nextLine());


        double sumNights = nights * 20.0;
        double sumCards = cards * 1.60;
        double sumTickets = tickets * 6.0;
        double totalSum = sumNights + sumCards + sumTickets;
        double sumGroup = totalSum * people;
        double finalSum = sumGroup + (sumGroup * 0.25);

        System.out.printf("%.2f", finalSum);



    }
}
