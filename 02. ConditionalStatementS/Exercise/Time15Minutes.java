package ConditionalStatementsWeek2.Exercise;

import java.util.Scanner;

public class Time15Minutes {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // входящи данни
        int hour = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());
        // добавяме 15 минути
        int finalTime = minutes + 15;
        // ако минутите прехвърлят 1 час
        if (finalTime >= 60){
            hour = hour +1;
            finalTime = finalTime - 60;
        }
        // ако часовете прехвърлят 24
        if (hour > 23){
            hour = hour - 24;
        }
        if (finalTime < 10){
            System.out.printf("%d:0%d", hour, finalTime);
        }else{
            System.out.printf("%d:%d", hour, finalTime);
        }

    }
}
