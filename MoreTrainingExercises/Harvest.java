package MoreTrainingExercises;

import java.util.Scanner;

public class Harvest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int placeM2 = Integer.parseInt(scanner.nextLine());
        double kgGrapePerM2 = Double.parseDouble(scanner.nextLine());
        int neededLiters = Integer.parseInt(scanner.nextLine());
        int workers = Integer.parseInt(scanner.nextLine());


        double placeForWine = placeM2 * 0.4;
        double sumGrape = placeForWine * kgGrapePerM2;
        double litersFromGrape = sumGrape / 2.5;
        double litersForPerson = (litersFromGrape - neededLiters) / workers;

        if (litersFromGrape < neededLiters){
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.", Math.floor(neededLiters - litersFromGrape));
        } else if (litersFromGrape >= neededLiters){
            System.out.printf("Good harvest this year! Total wine: %.0f liters.%n",litersFromGrape);
            System.out.printf("%.0f liters left -> %.0f liters per person.",Math.ceil(litersFromGrape-neededLiters),Math.ceil(litersForPerson));
        }



    }
}
