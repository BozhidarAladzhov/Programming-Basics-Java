package FirstStepsInCodingWeek1.Exercise;

import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        //1. Създаване на конзола/програма - Scanner
        Scanner scanner = new Scanner(System.in);
        //2. Входни данни:
        //2.1 Годишна такса за тренировки по баскетбол - Integer
        int annualTax = Integer.parseInt(scanner.nextLine());
        //3.Калкулации
        //3.1 Кецове = годишна такса - ( 40% от годиншната такса)
        //3.2 Екип = Кецове - ( 20 от кецовете)
        //3.3 Топка = Екип / 4
        //3.4 Аксесоари = Топка / 5
        //3.5 Всички разходи = (3.1 + 3.2 + 3.3. + 3.4)
        double sneakers = annualTax - (annualTax * 40/100.0);
        double outfit = sneakers - (sneakers * 20/100.0);
        double ball = outfit / 4;
        double accessories = ball /5;
        double totalExpenses = annualTax + sneakers + outfit + ball + accessories;

        //4. Принитиране на резултата
        System.out.println(totalExpenses);


    }
}
