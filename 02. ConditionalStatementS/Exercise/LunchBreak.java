package ConditionalStatementsWeek2.Exercise;

import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String film = scanner.nextLine();
        int timeEpisode = Integer.parseInt(scanner.nextLine());
        int timeBreak = Integer.parseInt(scanner.nextLine());

        double timeForLunch = timeBreak / 8.0;
        double timeForRest = timeBreak / 4.0;
        double timeLeft = timeBreak - timeForLunch - timeForRest;


        if (timeLeft>=timeEpisode){
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", film,Math.ceil(timeLeft-timeEpisode));
        }else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", film,Math.ceil(timeEpisode-timeLeft));
        }


    }
}
