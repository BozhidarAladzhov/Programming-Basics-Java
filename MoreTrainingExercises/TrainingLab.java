package MoreTrainingExercises;

import java.util.Scanner;

public class TrainingLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double length = Double.parseDouble(scanner.nextLine()); // в метри
        double width = Double.parseDouble(scanner.nextLine()); // в метри

        double workSpace = (70 + 40) + (70+80);
        double hallway = 100;
        double lengthInCm = length * 100;
        double widthInCm = width * 100;

        // заради Вратата -1 работно място
        // заради Катедрата - 2 работни места

        double widthToUse = widthInCm - 100;
        double workSpaceToWidth = Math.floor(widthToUse / 70);
        double workSpaceToLength = Math.floor(lengthInCm / 120);

        double totalSum = workSpaceToLength * workSpaceToWidth - 3;

        System.out.printf("%.0f", totalSum);




    }
}
