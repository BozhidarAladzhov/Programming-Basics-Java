package FirstStepsInCodingWeek1.Exercise;

import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {

        //1. Създаване на конзола/програма - Scanner
        Scanner scanner = new Scanner(System.in);
        //2. Входни данни:
        //2.1 Дължина СМ - Integer
        //2.2 Широчина CM - Integer
        //2.3 Височина CM - Integer
        //2.4 Процент  - Integer
        int lenght = Integer.parseInt(scanner.nextLine());
        int weidth = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        //3. Изчисления:
        //3.1 Обем на аквариума = дълж * широ * височината cm3
        //3.1 Обем на аквариума в дециметри = 1dm3 = 1000cm3
        //3.2 Необходими литри за напълване = Обема на аквариума
        //3.3 Процент запълнено пространство = процент * Обема на акварирума
        //3.4 Пространство за вода = Обема на аквариума - процента запълнено място
        int capacity = lenght * weidth * height;
        double convertToDM = capacity / 1000.0;
        double usedSpace = convertToDM * (percent/100.0);
        double water = convertToDM - usedSpace;

        //4. Принитране на резултата:
        System.out.println(water);




    }
}
