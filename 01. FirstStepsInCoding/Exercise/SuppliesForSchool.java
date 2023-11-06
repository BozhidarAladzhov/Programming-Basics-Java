package FirstStepsInCodingWeek1.Exercise;

import java.util.Scanner;

public class SuppliesForSchool {
    public static void main(String[] args) {
        // 1. Създаване на конзола/програма - скенер
        Scanner scanner = new Scanner(System.in);
        //2. Създаване на входни данни от конзола
        //2.1 брой пакет химикали - Integer
        //2.2 брой пакет маркери - Integer
        //2.3 литри препарат - Integer
        //2.4 процент намаление
        int pencils = Integer.parseInt(scanner.nextLine());
        int markers = Integer.parseInt(scanner.nextLine());
        int liquid = Integer.parseInt(scanner.nextLine());
        int discountPercent = Integer.parseInt(scanner.nextLine());

        //3.Изчисляване на данни и променливи
        //3.1 Обща сума химикалки (5.80)
        //3.2 Обща сума маркери (7.20)
        //3.3 Обща сума препарат (1.20)
        //3.4 Обща сума = химикалки + маркери + препарати
        //3.5 Отстъпка = Обща сума - ( % / 100.0 * Обща сума)
        //3.6 Крайна сума = Обща сума - отстъпка
        double sumPencils = pencils * 5.80;
        double sumMarkers = markers * 7.20;
        double sumLiquid = liquid * 1.20;
        double total = sumPencils + sumMarkers + sumLiquid;
        double discount = discountPercent / 100.0 * total;
        double TotalSum = total - discount;

        //4. Принтиране на резултата
        System.out.println(TotalSum);

    }
}
