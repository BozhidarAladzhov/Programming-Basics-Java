package ConditionalStatementsAdvancedWeek3.Lab;

import java.util.Scanner;

public class TradeCommissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        String town = scanner.nextLine();
        double sales = Double.parseDouble(scanner.nextLine());

        boolean townCheck = town.equals("Sofia") ||
                town.equals("Varna") ||
                town.equals("Plovdiv");
        boolean numCheck = sales >= 0;

        double percent = 0.00;
        if (town.equals("Sofia")){
            if (sales >= 0 && sales <= 500){
                percent = 0.05;
            } else if (sales > 500 && sales <= 1000){
                percent = 0.07;
            } else if (sales > 1000 && sales <= 10000){
                percent = 0.08;
            } else if (sales > 10000){
                percent = 0.12;
            }

        }else if (town.equals("Varna")) {
            if (sales >= 0 && sales <= 500) {
                percent = 0.045;
            } else if (sales > 500 && sales <= 1000) {
                percent = 0.075;
            } else if (sales > 1000 && sales <= 10000) {
                percent = 0.10;
            } else if (sales > 10000) {
                percent = 0.13;
            }
        }else if (town.equals("Plovdiv")) {
            if (sales >= 0 && sales <= 500) {
                percent = 0.055;
            } else if (sales > 500 && sales <= 1000) {
                percent = 0.08;
            } else if (sales > 1000 && sales <= 10000) {
                percent = 0.12;
            } else if (sales > 10000) {
                percent = 0.145;
            }
        }

        if (townCheck && numCheck){
            double sum = sales * percent;
            System.out.printf("%.2f", sum);
        } else {
            System.out.println("error");
        }

    }
}
