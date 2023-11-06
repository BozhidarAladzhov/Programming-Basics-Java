package FirstStepsInCodingWeek1.Exercise;

import java.util.Scanner;

public class VacationBooksList {
    public static void main(String[] args) {

        //1.създаване на конзола/програма - скенер
        Scanner scanner = new Scanner(System.in);
        //2.Входящи данни: брой страници - integer; страници за 1 час - integer ; задълж. брой дни за прочитане на книга - integer
        int pages = Integer.parseInt(scanner.nextLine());
        int pagesPerHour = Integer.parseInt(scanner.nextLine());
        int mustDaysToRead = Integer.parseInt(scanner.nextLine());
        //3. Изчисления:
        // 3.1 Общо време за четене на една книга = броя страници / страници за час
        // 3.2 Необходими часове на ден = страници за час / брой дни
        int timeForOneBook = pages / pagesPerHour;
        int hoursPerDay = timeForOneBook / mustDaysToRead;

        //4. Принтиране на резултата
        System.out.println(hoursPerDay);


    }
}
