package WhileLooopWeek5.Exercise;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double tripPrice = Double.parseDouble(scanner.nextLine());
        double availableMoney = Double.parseDouble(scanner.nextLine());


        double savedMoney = availableMoney;
        int spendCounter =0;
        int dayCounter =0;

        while (savedMoney < tripPrice && spendCounter < 5){
            String information = scanner.nextLine();
            double money = Double.parseDouble(scanner.nextLine());
            dayCounter++;

            if (information.equals("save")){
                savedMoney += money;
                spendCounter = 0;
            }else if (information.equals("spend")){
                spendCounter++;
                savedMoney -= money;
                if (money > savedMoney){
                    savedMoney =0;
                }
            }

        }

        if (spendCounter == 5){
            System.out.println("You can't save the money.");
            System.out.println(dayCounter);
        }

        if (savedMoney >= tripPrice){
            System.out.printf("You saved the money for %d days.",dayCounter);
        }
    }
}
