package FirstStepsInCodingWeek1.Lab;

import java.util.Scanner;

public class InchesToCentimeters {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       // създаване на скенер
        double inches = Double.parseDouble(scanner.nextLine());
        //Създаване на вход
        double cm = 2.54;
        double total = inches * cm;
        //конзолата трябва да сметне инчове в сантиметри
        System.out.println(total);
        //принтиране на конзолата
    }
}
