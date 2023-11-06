package ConditionalStatementsWeek2.Exercise;

import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double recordInSeconds = Double.parseDouble(scanner.nextLine());
        double meters = Double.parseDouble(scanner.nextLine());
        double timeInSecondsForOneMeter = Double.parseDouble(scanner.nextLine());

        double swimmingTime = meters * timeInSecondsForOneMeter;
        double resistance = meters / 15;
        double down = Math.floor(resistance);
        double finishTime = swimmingTime + (down * 12.5);


        if (finishTime<recordInSeconds){
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.",finishTime);
        }else {
            System.out.printf("No, he failed! He was %.2f seconds slower.",finishTime-recordInSeconds);
        }

    }
}
