package FirstStepsInCodingWeek1.Lab;

import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //създаване на конзола/скенер/програма
        double cm2 = Double.parseDouble(scanner.nextLine());
        //създаване на вход
        double price = cm2 * 7.61;
        double discount = price * 0.18;
        double finalprice = price - discount;
        //допълнителна информация
        System.out.println("The final price is: " + finalprice + " lv.");
        System.out.println("The discount is: " + discount + " lv.");

        //отпечатване на резултата


    }
}
