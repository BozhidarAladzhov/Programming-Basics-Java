package ConditionalStatementsWeek2.Exercise;

import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Петър иска да купи N видеокарти, M процесора и P на брой рам памет.
        double budget = Double.parseDouble(scanner.nextLine());
        int videoCards = Integer.parseInt(scanner.nextLine());
        int processors = Integer.parseInt(scanner.nextLine());
        int ramMemory = Integer.parseInt(scanner.nextLine());

        //•	Видеокарта – 250 лв./бр.
        //•	Процесор – 35% от цената на закупените видеокарти/бр.
        //•	Рам памет – 10% от цената на закупените видеокарти/бр.
        int sumVideoCards = videoCards * 250;
        double sumProcessors = (sumVideoCards * 0.35) * processors;
        double sumRamMemory = (sumVideoCards * 0.10) * ramMemory;

        double totalSum = sumVideoCards + sumProcessors + sumRamMemory;
        // Ако броя на видеокартите е по-голям от този на процесорите получава 15% отстъпка от крайната сметка.
        if (videoCards > processors){
            totalSum = totalSum - (totalSum * 0.15);
        }

        if (totalSum <= budget){
            System.out.printf("You have %.2f leva left!",budget - totalSum);
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!",totalSum - budget);
        }


    }
}
