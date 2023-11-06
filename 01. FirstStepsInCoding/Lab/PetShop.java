package FirstStepsInCodingWeek1.Lab;

import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //създаване на програма/конзола/скенер
        int dogfoodpcs = Integer.parseInt(scanner.nextLine());
        int catfoodpcs = Integer.parseInt(scanner.nextLine());
        // създаване на вход
        double dogfood = dogfoodpcs * 2.5;
        int catfood = catfoodpcs * 4;
        //допълнителна информация
        System.out.println(dogfood + catfood + " lv.");

        //отпечатване
    }
}
