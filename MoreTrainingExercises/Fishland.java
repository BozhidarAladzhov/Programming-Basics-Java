package MoreTrainingExercises;

import java.util.Scanner;

public class Fishland {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // паламуд 60% по-скъп от скумрията
        // сафрид 80% по-скъп от цацата
        // миди - 7.50лв/кг
        // ще ги храни с паламуд, сафрид и миди

        double priceMackerel = Double.parseDouble(scanner.nextLine()); // цена на скумрията
        double priceSprinkle = Double.parseDouble(scanner.nextLine()); // цена на цацата
        double weightBonito = Double.parseDouble(scanner.nextLine()); // килограми на паламуд
        double weightScad = Double.parseDouble(scanner.nextLine()); // килограми сафрид
        double weightMussels = Double.parseDouble(scanner.nextLine()); // килограми миди

        double priceBonito = priceMackerel + (priceMackerel * 0.6);
        double priceScad = priceSprinkle + (priceSprinkle * 0.8);
        double priceMussels = 7.50;

        double sumBonito = weightBonito * priceBonito;
        double sumScad = weightScad * priceScad;
        double sumMussels = weightMussels * priceMussels;
        double totalSum = sumScad + sumMussels + sumBonito;

        System.out.printf("%.2f", totalSum);





    }
}
