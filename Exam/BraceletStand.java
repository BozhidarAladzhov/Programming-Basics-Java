package Exam;

import java.util.Scanner;

public class BraceletStand {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double dailyMoney = Double.parseDouble(scanner.nextLine());
        double dailyProfit = Double.parseDouble(scanner.nextLine());
        double expenses5Days = Double.parseDouble(scanner.nextLine());
        double giftValue = Double.parseDouble(scanner.nextLine());
        // 5 дни

        double sumDailyMoney = dailyMoney * 5;
        double sumDailyProfit = dailyProfit * 5;
        double sumMoney = sumDailyMoney + sumDailyProfit;
        double finalMoney = sumMoney - expenses5Days;

        if (finalMoney > giftValue){
            System.out.printf("Profit: %.2f BGN, the gift has been purchased.",finalMoney);
        }else {
            System.out.printf("Insufficient money: %.2f BGN.", giftValue - finalMoney);
        }



    }
}
