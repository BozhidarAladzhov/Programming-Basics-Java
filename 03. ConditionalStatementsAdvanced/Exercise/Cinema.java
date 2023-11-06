package ConditionalStatementsAdvancedWeek3.Exercise;

import java.util.Scanner;

public class Cinema {

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        String film = scanner.nextLine();
        int row = Integer.parseInt(scanner.nextLine());
        int column = Integer.parseInt(scanner.nextLine());

        double price = 0.0;
        if (film.equals("Premiere")){
            price = 12.0;
        }else if (film.equals("Normal")){
            price = 7.50;
        }else if (film.equals("Discount")){
            price = 5.00;
        }

        double sumPrice = (row * column * price);
        System.out.printf("%.2f leva", sumPrice);




    }
}
