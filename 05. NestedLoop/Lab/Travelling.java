package NestedLoopWeek6.Lab;

import java.util.Scanner;

public class Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("End")){
            String destination = input;
            double priceTripe = Double.parseDouble(scanner.nextLine());
            double sum = 0;

            while (sum < priceTripe){
                double money = Double.parseDouble(scanner.nextLine());
                sum += money;
            }

            System.out.printf("Going to %s!%n",destination);

            input = scanner.nextLine();

        }

    }
}
