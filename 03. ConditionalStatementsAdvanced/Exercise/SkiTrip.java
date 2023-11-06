package ConditionalStatementsAdvancedWeek3.Exercise;

import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        String room = scanner.nextLine();
        String note = scanner.nextLine();


        double price = 0;
        switch (room){
            case "room for one person":
                price = 18.00;
                break;
            case "apartment":
                price = 25.00;
                if ((days-1)<10){
                    price = price - (price * 0.3);
                }else if ((days-1) >= 10 && (days-1) <=15){
                    price = price - (price * 0.35);
                }else if ((days-1) > 15){
                    price = price - (price * 0.5);
                }
                break;
            case "president apartment":
                price = 35.00;
                if ((days-1) < 10){
                    price = price - (price *0.1);
                } else if ((days-1) >= 10 && (days-1) <=15){
                    price = price - (price * 0.15);
                }else if ((days-1) > 15){
                    price = price - (price * 0.2);
                }
                break;
        }
        double totalPrice = price * (days-1);
        if (note.equals("positive")){
            totalPrice = totalPrice + (totalPrice*0.25);
        }else if (note.equals("negative")){
            totalPrice = totalPrice - (totalPrice*0.1);
        }

        System.out.printf("%.2f", totalPrice);

    }
}
