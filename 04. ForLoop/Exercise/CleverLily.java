package ForLoop.Exercise;

import java.util.Scanner;

public class CleverLily {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int currentAges = Integer.parseInt(scanner.nextLine()); //настоящи години на Лили
        double priceMachine = Double.parseDouble(scanner.nextLine()); // цена на пералня
        int priceToy = Integer.parseInt(scanner.nextLine()); // цена на играчка за 1 бр.

        int toys = 0;
        int money = 0;
        int giftSum =0;
        for (int age = 1; age <= currentAges; age++){
            if (age % 2 == 1){
            toys++;
            }else{
            giftSum+=10;
            money += giftSum - 1;
            }
        }

        int sumMoney = money;
        int sumToys = toys * priceToy;
        int savedMoney = sumMoney + sumToys;

        if (savedMoney >= priceMachine){
            System.out.printf("Yes! %.2f", savedMoney - priceMachine);
        }else{
            System.out.printf("No! %.2f", priceMachine - savedMoney);
        }


    }
}
