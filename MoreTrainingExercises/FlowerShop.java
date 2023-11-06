package MoreTrainingExercises;

import java.util.Scanner;

public class FlowerShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // магнолии - 3.25
        // зюмбюли - 4.00
        // рози - 3.50
        // кактуси - 8.00

        // 5 % данъци от общата сума

        int flower1 = Integer.parseInt(scanner.nextLine());
        int flower2 = Integer.parseInt(scanner.nextLine());
        int flower3 = Integer.parseInt(scanner.nextLine());
        int flower4 = Integer.parseInt(scanner.nextLine());
        double giftPrice = Double.parseDouble(scanner.nextLine());


        double sumFlower1 = flower1 * 3.25;
        double sumFlower2 = flower2 * 4.00;
        double sumFlower3 = flower3 * 3.50;
        double sumFlower4 = flower4 * 8.00;
        double sumFlowers = sumFlower1 + sumFlower2 + sumFlower3 + sumFlower4;
        double duty = sumFlowers * 0.05;
        double sumLeft = sumFlowers - duty;

        if (sumLeft >= giftPrice){
            System.out.printf("She is left with %.0f leva.",Math.floor(sumLeft - giftPrice));
        }else {
            System.out.printf("She will have to borrow %.0f leva.",Math.ceil(giftPrice - sumLeft));
        }




    }
}
