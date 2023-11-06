package WhileLooopWeek5.Exercise;

import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numBadPoints = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        int numMistakes=0;
        int numTasks =0;
        double sumPoints =0;
        String lastProblem = "";

        while (!input.equals("Enough")){
                numTasks++;
                int points = Integer.parseInt(scanner.nextLine());
                if (points <= 4){
                    numMistakes++;
                }

                if (numMistakes >= numBadPoints){
                    System.out.printf("You need a break, %d poor grades.",numMistakes);
                    break;
                }
            lastProblem = input;
            sumPoints += points;
            input = scanner.nextLine();
        }
            if (input.equals("Enough")){
                double averagePoints = sumPoints / numTasks;
                System.out.printf("Average score: %.2f%n",averagePoints);
                System.out.printf("Number of problems: %d%n",numTasks);
                System.out.printf("Last problem: %s",lastProblem);
            }




    }
}
