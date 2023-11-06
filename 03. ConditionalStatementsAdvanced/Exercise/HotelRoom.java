package ConditionalStatementsAdvancedWeek3.Exercise;

import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());
        double priceStudio = 0;
        double priceApartment=0;

        switch (month){
            case "May":
            case "October":
                priceStudio = 50;
                priceApartment = 65;
                if (nights > 7 && nights < 14){
                    priceStudio = priceStudio - (priceStudio * 0.05);
                }else if (nights > 14){
                    priceStudio = priceStudio - (priceStudio * 0.3);
                    priceApartment = priceApartment - (priceApartment * 0.1);
                }
                break;
            case "June":
            case "September":
                priceStudio = 75.20;
                priceApartment = 68.70;
                if (nights > 14){
                    priceStudio = priceStudio - (priceStudio * 0.2);
                    priceApartment = priceApartment - (priceApartment * 0.1);
                }
                break;
            case "July":
            case "August":
                priceStudio = 76;
                priceApartment = 77;
                if (nights > 14){
                    priceApartment = priceApartment - (priceApartment * 0.1);
                }
                break;
        }

        System.out.printf("Apartment: %.2f lv.%n",priceApartment * nights);
        System.out.printf("Studio: %.2f lv.", priceStudio * nights);

    }
}
