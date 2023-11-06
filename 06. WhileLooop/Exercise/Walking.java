package WhileLooopWeek5.Exercise;

import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Габи - 10 000 стъпки на ден - цел

        // Цикъла ще оформен колко "Going home"

        // данни от конзолата ще са стъпките които прави и ще бъдат парснати от стринг

        // Стопер на действие е Going home + добавя стъпки до прибиране

        // Когато постигне целта : "Goal reached! Good job!" и да изчислим колко стъпки повече е направила

        // Когат не посигне целата: Изчисляваме колко стъпки са и останали

        //


        int targetSteps = 10000;
        int sumSteps =0;

        String input = scanner.nextLine();

        while (!input.equals("Going home")){
            int steps = Integer.parseInt(input);
            sumSteps +=steps;

            if (sumSteps > targetSteps){
                break;
            }
            input = scanner.nextLine();

        }

        if (input.equals("Going home")){
            int stepsToHome = Integer.parseInt(scanner.nextLine());
            sumSteps += stepsToHome;
        }

        if (sumSteps > targetSteps){
            int sumOver = sumSteps - targetSteps;
            System.out.println("Goal reached! Good job!");
            System.out.printf("%d steps over the goal!",sumOver);
        } else if (sumSteps < targetSteps) {
            int sumMoreSteps = targetSteps - sumSteps;
            System.out.printf("%d more steps to reach goal.",sumMoreSteps);
        }

    }
}
