package ForLoop.Exercise;

import java.util.Scanner;

public class Oscars {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String nameActor = scanner.nextLine();
        double academyPoints = Double.parseDouble(scanner.nextLine());
        int numJury = Integer.parseInt(scanner.nextLine());
        double sumJuryPoints = 0;
        double sumPoints = academyPoints;

        for (int number = 1; number <=numJury; number++) {
            String nameJury = scanner.nextLine();
            double juryPoints = Double.parseDouble(scanner.nextLine());
                int nameJuryLength = nameJury.length();
                sumJuryPoints = juryPoints * nameJuryLength /2;
                sumPoints += sumJuryPoints;



                if (sumPoints > 1250.50) {
                    System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!" ,nameActor, sumPoints);
                    break;
                }

        }

        if (sumPoints <= 1250.50) {
            System.out.printf("Sorry, %s you need %.1f more!",nameActor,1250.50 - sumPoints);
        }
    }
}
