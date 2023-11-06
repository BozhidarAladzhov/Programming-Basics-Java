package Exam;

import java.util.Scanner;

public class SantasHoliday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // room for one person – 18.00 лв за нощувка
        // apartment – 25.00 лв за нощувка
        // president apartment – 35.00 лв за нощувка

        // пример 11 = 10 дни ( нощувки )

        // ако оценката на дядо Коледа е positive = 25% доп отстъпка
        // ако оценката на дядо Коледа е negative = 10% доп отстъпка

        int days = Integer.parseInt(scanner.nextLine());
        String room = scanner.nextLine();
        String rating = scanner.nextLine();

        int nights = days - 1;
        double price = 0;


        if (room.equals("room for one person")){
            if (nights <  10){
                price = nights * 18.00;
            }else if (nights >= 10 && nights <= 15){
                price = nights * 18.00;
            }else{
                price = nights * 18.00;
            }

        } else if (room.equals("apartment")) {
            if (nights < 10) {
                price = nights * 25.00;
                price = price - (price * 0.30);
            } else if (nights >= 10 && nights <= 15) {
                price = nights * 25.00;
                price = price - (price * 0.35);
            } else {
                price = nights * 25.00;
                price = price - (price * 0.50);
            }
        }else if (room.equals("president apartment")) {
            if (nights < 10) {
                price = nights * 35.00;
                price = price - (price * 0.10);
            } else if (nights >= 10 && nights <= 15) {
                price = nights * 35.00;
                price = price - (price * 0.15);
            } else {
                price = nights * 35.00;
                price = price - (price * 0.20);
            }
        }

        if (rating.equals("positive")){
            price = price + (price * 0.25);
        }else if (rating.equals("negative")){
            price = price - (price * 0.10);
        }

        System.out.printf("%.2f", price);




    }
}
