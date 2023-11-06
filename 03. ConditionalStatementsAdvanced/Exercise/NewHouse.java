package ConditionalStatementsAdvancedWeek3.Exercise;

import java.util.Scanner;

public class NewHouse {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String flowers = scanner.nextLine();
        int number = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double price = 0;

        if (flowers.equals("Roses")){
            price = 5;
            if(number > 80){
            price = price - (price * 0.1);
            }
        }else if (flowers.equals("Dahlias")){
            price = 3.80;
            if(number > 90 ){
                price = price - (price * 0.15);
            }
        }else if (flowers.equals("Tulips")){
            price = 2.80;
            if (number > 80){
                price = price - (price * 0.15);
            }
        }else if (flowers.equals("Narcissus")){
            price = 3.00;
            if (number < 120){
                price = price + (price * 0.15);
            }
        }else if (flowers.equals("Gladiolus")){
            price = 2.50;
            if (number < 80){
                price = price + (price * 0.20);
            }
        }
         double sum = number * price;
        if (sum <= budget){
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", number , flowers, budget-sum);
        }else{
            System.out.printf("Not enough money, you need %.2f leva more.", sum-budget);
        }

    }
}
