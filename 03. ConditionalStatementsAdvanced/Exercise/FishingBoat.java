package ConditionalStatementsAdvancedWeek3.Exercise;

import java.util.Scanner;

public class FishingBoat {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int number = Integer.parseInt(scanner.nextLine());

        double seasonPrice = 0;

        switch (season){
            case "Spring":
                seasonPrice = 3000;
                break;
            case "Summer":
            case "Autumn":
                seasonPrice = 4200;
                break;
            case "Winter":
                seasonPrice = 2600;
                break;
        }

        if (number <= 6){
            seasonPrice = seasonPrice - (seasonPrice * 0.1);
        } else if (number>=7 && number<=11){
            seasonPrice = seasonPrice - (seasonPrice * 0.15);
        }else if (number >= 12){
            seasonPrice = seasonPrice - (seasonPrice * 0.25);
        }

        if (season.equals("Spring") ||
        season.equals("Summer") || season.equals("Winter")){
            if (number % 2 == 0)
            seasonPrice = seasonPrice - (seasonPrice * 0.05);
        }

        if (seasonPrice <= budget){
            System.out.printf("Yes! You have %.2f leva left.", budget - seasonPrice);
        }else {
            System.out.printf("Not enough money! You need %.2f leva.", seasonPrice - budget);
        }
    }
}
