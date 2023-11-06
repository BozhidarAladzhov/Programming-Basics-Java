package WhileLooopWeek5.Loop;

import java.util.Scanner;

public class AccountBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = 0;
        String input = scanner.nextLine();
        while (!input.equals("NoMoreMoney")){
            double num= Double.parseDouble(input);
            if (num < 0){
                System.out.println("Invalid operation!");
                break;
            }
            System.out.printf("Increase: %.2f%n",num);
            sum += num;
            input = scanner.nextLine();



        }

        System.out.printf("Total: %.2f", sum);

    }
}
