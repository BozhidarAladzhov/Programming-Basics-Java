package MoreTrainingExercises;

import java.util.Scanner;

public class SleepyTomCat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int restDays = Integer.parseInt(scanner.nextLine());

        // норма на година 30 000 минути
        // работен ден - 63 минути на ден
        // почиевен ден - 127 минути на ден

        // година = 365 дни

        int workDays = 365 - restDays;
        int workDaysPlay = workDays * 63;
        int restDaysPlay = restDays * 127;
        int totalPlayedTime = workDaysPlay + restDaysPlay;
        int diff = 30000 - totalPlayedTime;
        int hoursPlayed = Math.abs(diff / 60);
        int minutesPlayed = Math.abs(diff % 60);




        if (totalPlayedTime > 30000){
            System.out.println("Tom will run away");
            System.out.printf("%d hours and %d minutes more for play", hoursPlayed, minutesPlayed);
        }else if (totalPlayedTime < 30000){
            System.out.println("Tom sleeps well");
            System.out.printf("%d hours and %d minutes less for play",hoursPlayed,minutesPlayed);
        }




    }
}
