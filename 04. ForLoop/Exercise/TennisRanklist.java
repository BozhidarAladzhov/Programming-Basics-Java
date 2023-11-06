package ForLoop.Exercise;

import java.util.Scanner;

public class TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numTournaments = Integer.parseInt(scanner.nextLine());
        int startPoints = Integer.parseInt(scanner.nextLine());

        int placePoints = 0;
        int sumTotalPoints = startPoints;
        double win = 0;

        for (int num = 1; num <= numTournaments; num++){
            String place = scanner.nextLine();
            if (place.equals("W")){
                placePoints = 2000;
                sumTotalPoints += placePoints;
                win++;
            }else if (place.equals("F")){
                placePoints = 1200;
                sumTotalPoints += placePoints;
            }else if (place.equals("SF")){
                placePoints = 720;
                sumTotalPoints += placePoints;
            }

        }

        System.out.printf("Final points: %d%n",sumTotalPoints);
        int averagePointsPerTournaments = (sumTotalPoints - startPoints) / numTournaments;
        System.out.printf("Average points: %d%n", averagePointsPerTournaments);
        double averageWins = win / numTournaments * 100;
        System.out.printf("%.2f%%",averageWins);



    }
}
