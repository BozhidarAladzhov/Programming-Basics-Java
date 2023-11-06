package FirstStepsInCodingWeek1.Exercise;

import java.util.Scanner;

public class RadiansToDegrees {
    public static void main(String[] args) {
        // 1. Създаване на програма/конзола - скенер
        Scanner scanner = new Scanner(System.in);
        // 2. Създаване на входни данни от конзола - Радиани
        double Radians = Double.parseDouble(scanner.next());
        // 3. Изчисляване на радиани в градуси (градус = радиан * 180 / π.)
        double Degrees = Radians * 180 / Math.PI;
        // 4. Принтиране на резултата
        System.out.println(Degrees);
    }
}
