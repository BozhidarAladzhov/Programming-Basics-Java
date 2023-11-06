package Exam;

import java.util.Scanner;

public class ExcursionSale {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        // sea = 680лв
        // mountain = 499лв

        // при неналичен пакет = 0;

        int seaTrips = Integer.parseInt(scanner.nextLine());
        int mountainTrips = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int priceSea = 0;
        int seaCounter =seaTrips;
        int mountainCounter =mountainTrips;
        int priceMountain = 0;


        while (!input.equals("Stop")){
            if (input.equals("sea")){
                if (seaCounter == 0) {
                    priceSea += 0;
                }else {
                priceSea += 680;
                seaCounter --;
                }
            }else if (input.equals("mountain")) {
                if (mountainCounter ==0){
                    priceMountain += 0;
                }else {
                    priceMountain += 499;
                    mountainCounter --;
                }


            }

            if ((mountainCounter+seaCounter) == 0){
                System.out.println("Good job! Everything is sold.");
                break;
            }

            input = scanner.nextLine();
        }

        int profit = priceSea + priceMountain;
        System.out.printf("Profit: %d leva.", profit);



    }
}
