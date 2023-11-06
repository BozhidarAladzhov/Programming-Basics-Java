package ConditionalStatementsAdvancedWeek3.Exercise;

import java.util.Scanner;

public class SummerOutfit {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        int celsius = Integer.parseInt(scanner.nextLine());
        String timeOfTheDay = scanner.nextLine();

        String outfit = "";
        String shoes = "";

        if (timeOfTheDay.equals("Morning")){
            if (celsius >= 10 && celsius <= 18){
                outfit = "Sweatshirt";
                shoes = "Sneakers";
            }else if (celsius > 18 && celsius <= 24){
                outfit = "Shirt";
                shoes = "Moccasins";
            }else if (celsius >= 25){
                outfit = "T-Shirt";
                shoes = "Sandals";
            }
        } else if ((timeOfTheDay.equals("Afternoon"))) {
            if (celsius >= 10 && celsius <= 18) {
                outfit = "Shirt";
                shoes = "Moccasins";
            } else if (celsius > 18 && celsius <= 24) {
                outfit = "T-Shirt";
                shoes = "Sandals";
            } else if (celsius >= 25) {
                outfit = "Swim Suit";
                shoes = "Barefoot";
            }
        } else if ((timeOfTheDay.equals("Evening"))) {
            if (celsius >= 10 && celsius <= 18) {
                outfit = "Shirt";
                shoes = "Moccasins";
            } else if (celsius > 18 && celsius <= 24) {
                outfit = "Shirt";
                shoes = "Moccasins";
            } else if (celsius >= 25) {
                outfit = "Shirt";
                shoes = "Moccasins";
            }
        }
        // It's {градуси} degrees, get your {облекло} and {обувки}."
        System.out.printf("It's %d degrees, get your %s and %s.", celsius, outfit, shoes);


    }
}
