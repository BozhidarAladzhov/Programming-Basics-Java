package MoreTrainingExercises;

import java.util.Scanner;

public class VegetableMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceVegies = Double.parseDouble(scanner.nextLine());
        double priceFruits = Double.parseDouble(scanner.nextLine());
        int kgsVegies = Integer.parseInt(scanner.nextLine());
        int kgsFruits = Integer.parseInt(scanner.nextLine());

        double sumVegetables = priceVegies * kgsVegies;
        double sumFruits = priceFruits * kgsFruits;

        double totalSum = (sumVegetables + sumFruits) / 1.94;

        System.out.printf("%.2f", totalSum);


    }
}
