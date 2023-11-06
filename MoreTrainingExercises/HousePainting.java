package MoreTrainingExercises;

import java.util.Scanner;

public class HousePainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // разход зелена боя = 1л/3.4 м2
        // разход червена боя = 1л/4.3м2

        double houseHeight = Double.parseDouble(scanner.nextLine());
        double sideLength = Double.parseDouble(scanner.nextLine());
        double roofHeight = Double.parseDouble(scanner.nextLine());

        double areaLeft = houseHeight * sideLength;
        double window = 1.5 * 1.5;
        double clearAreaLeft = areaLeft - window;

        double areaFront = houseHeight * houseHeight;
        double door = 1.2 * 2;
        double clearAreaFront = areaFront - door;

        double areaRoofSide = houseHeight * sideLength;
        double areaRoofFront = houseHeight * roofHeight / 2;

        double greenArea = 2 * clearAreaLeft + areaFront + clearAreaFront;
        double redArea = (2 * areaRoofSide) + (2 * areaRoofFront);

        double greenPaint = greenArea / 3.4;
        double redPaint = redArea / 4.3;

        System.out.printf("%.2f%n",greenPaint);
        System.out.printf("%.2f", redPaint);



    }
}
