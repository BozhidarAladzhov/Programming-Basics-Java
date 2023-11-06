package ConditionalStatementsWeek2.Exercise;

import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // входящи данни от конзола
        double priceTrip = Double.parseDouble(scanner.nextLine());
        int puzzles = Integer.parseInt(scanner.nextLine());
        int puppets = Integer.parseInt(scanner.nextLine());
        int bears = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int trucks = Integer.parseInt(scanner.nextLine());
        int sumToys = puzzles + puppets + bears + minions + trucks;

        // цени на играчки: пъзел - 2.60; кукла - 3.00; мече - 4.10; миньон - 8.20; камионче - 2.00.
        double sumPuzzles = puzzles * 2.60;
        double sumPuppets = puppets * 3.00;
        double sumBears = bears * 4.10;
        double sumMinions = minions * 8.20;
        double sumTrucks = trucks * 2.00;

        // сума на поръчка
        double total = sumPuzzles + sumPuppets + sumBears + sumMinions + sumTrucks;

        // над 50 играчки - 25% отстъпка от цената
        if (sumToys >= 50) {
            total = total - (total * 0.25);
    }
        // 10% от спечелините пари са за наем
        double rent = total * 0.1;
        // печалба
        double profit = total - rent;

        if (profit >= priceTrip){
            System.out.printf("Yes! %.2f lv left.", profit - priceTrip);
        }else{
            System.out.printf("Not enough money! %.2f lv needed.", priceTrip - profit );
        }

}}
