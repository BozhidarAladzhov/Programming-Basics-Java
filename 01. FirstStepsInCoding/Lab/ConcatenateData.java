package FirstStepsInCodingWeek1.Lab;

import java.util.Scanner;

public class ConcatenateData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //създаване на конзола (скенер)
        String FirstName = scanner.nextLine();
        String LastName = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String Town = scanner.nextLine();
        //създаване на вход
        System.out.printf("You are %s %s, a %d-years old person from %s.", FirstName, LastName, age, Town);
        //принтиране на резултата
    }
}
