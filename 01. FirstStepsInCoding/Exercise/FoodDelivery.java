package FirstStepsInCodingWeek1.Exercise;

import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        //1. Създаване на конзона/програма - Scanner
        Scanner scanner = new Scanner(System.in);

        //2. Входящи данни от конзола:
        //2.1 Брой пилешки менюта - Integer
        //2.2 Брой менюта с риба - Integer
        //2.3 Брой вегетариански менюта - Integer
        int chickenMenu = Integer.parseInt(scanner.nextLine());
        int fishMenu = Integer.parseInt(scanner.nextLine());
        int vegetarianMenu = Integer.parseInt(scanner.nextLine());

        //3. Изчисления:
        //3.1 Цена пилешко меню = брой * 10.35
        //3.2 Цена риба меню = брой * 12.40
        //3.3 Цена вегетариснко меню = брой * 8.15
        //3.4 Обща сума менюта = 3.1 + 3.2. + 3.3
        //3.5 Цена десет = 3.5 * 20%
        //3.6 Доставка = 2.50
        //3.7 Обща цена
        double chickenMenuPrice = chickenMenu * 10.35;
        double fishMenuPrice = fishMenu * 12.40;
        double vegetarianMenuPrice = vegetarianMenu * 8.15;
        double menusPrice = chickenMenuPrice + fishMenuPrice + vegetarianMenuPrice;
        double dessert = menusPrice * 20/100.00;
        double delivery = 2.50;
        double totalPrice = menusPrice + dessert + delivery;

        //4. Принтиране на резултата
        System.out.println(totalPrice);
    }
}
