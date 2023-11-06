package MoreTrainingExercises;

import java.util.Scanner;

public class FuelTankPart2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // бензин = 2.22/л
        // дизел = 2.33/л
        // газ = 0.93/л

        //с карта -18ст/бензин ; -12ст/дизел ; -8ст/газ

        // между 20 и 25 литра, полуава 8% отстъпка от крайната цена
        // над 25 литра горива, получава 10% отстъпка от крайната цена

        String fuel = scanner.nextLine(); // Gas ; Gasoline ; Diesel
        double qty = Double.parseDouble(scanner.nextLine());
        String card = scanner.nextLine(); // Yes ; No


        double price = 0;

        switch (fuel) {
            case "Gasoline":
                price = 2.22;
                break;
            case "Diesel":
                price = 2.33;
                break;

            case "Gas":
                price = 0.93;
                break;
        }

        if (card.equals("Yes")){
            switch (fuel){
                case "Gasoline":
                    price = 2.22 - 0.18;
                    break;
                case "Diesel":
                    price = 2.33 - 0.12;
                    break;

                case "Gas":
                    price = 0.93 - 0.08;
                    break;
            }
        }


        double sum = qty * price;

        if (qty >= 20 && qty <= 25){
            sum = sum - (sum * 0.08);
        }else if (qty > 25){
            sum = sum - (sum * 0.1);
        }

        System.out.printf("%.2f lv.",sum);

    }
}
