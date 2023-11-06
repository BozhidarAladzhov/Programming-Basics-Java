package ConditionalStatementsAdvancedWeek3.Exercise;

import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        // Ако е лято ще почива на къмпинг, а зимата в хотел
        String place = "";
        if (season.equals("summer")) {
            place = "Camp";
        } else if (season.equals("winter")) {
            place = "Hotel";
        }

        //Бюджета определя дестинацията
        String destination = "";
        double price = 0;
        if (budget <= 100) {
            destination = "Bulgaria";
            if (place.equals("Camp")) {
                price = budget * 0.3;
            } else if (place.equals("Hotel")) {
                price = budget * 0.7;
            }
        } else if (budget <= 1000) {
            destination = "Balkans";
            if (place.equals("Camp")) {
                price = budget * 0.4;
            } else if (place.equals("Hotel")) {
                price = budget * 0.8;
            }

        } else if (budget > 1000) {
            destination = "Europe";
            place = "Hotel";
            price = budget * 0.9;
        }



    //Всеки къмпинг или хотел, според дестинацията, има собствена цена която отговаря на даден процент от бюджета:
        System.out.printf("Somewhere in %s%n",destination);
        System.out.printf("%s - %.2f",place,price);
}
    }

