package FirstStepsInCodingWeek1.Exercise;

import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {

        //1. Създаване на конзола/програма - скенер
        Scanner scanner = new Scanner(System.in);
        //2.Входни данни:
        //2.1 Количество найлон - Integer
        //2.2 Количество боя - Integer
        //2.3 Количество разредител - Integer
        //2.4 Часове работа на майсторите - Integer
        int naylon = Integer.parseInt(scanner.nextLine());
        int paint = Integer.parseInt(scanner.nextLine());
        int liquid = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());

        //3. Калкулации
        //3.1 Цена за найлони = (Количество найлон + 2)*1.50
        double sumNaylon = (naylon+2) * 1.50;
        //3.2 Цена за боя = (количество боя + (количество боя* 10%) * 14.50
        double sumPaint = (paint + (paint * 10 / 100.0)) * 14.50;
        //3.3 Цена за разредител = количество разредител * 5.00
        double sumLiquid = liquid * 5.00;
        //3.4 Цена торбички = 0.40
        double bag = 0.40;
        //3.5 Обща сума материали = 3.1 + 3.2 + 3.3. + 3.4
        double sumMaterial = sumNaylon + sumPaint + sumLiquid + bag;
        //3.6 Цена майстори = (Обща сума материали * 30%) * часовете работа на майсторите
        double workers = (sumMaterial* 30/100.0) * hours;
        //3.7 Сума за всички разходи = 3.5 + 3.6
        double total = sumMaterial + workers;

        //4. Отпечатване на резлутата
        System.out.println(total);
    }
}
