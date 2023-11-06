package WhileLooopWeek5.Exercise;

import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lengthCake = Integer.parseInt(scanner.nextLine());
        int widthCake = Integer.parseInt(scanner.nextLine());
        int sumCakes = lengthCake * widthCake;

        int cakeMissing = 0;
        String command = scanner.nextLine();


        while (!command.equals("STOP")){
            int cakePiece = Integer.parseInt(command);
            sumCakes -= cakePiece;

            if (sumCakes < 0){
                cakeMissing = sumCakes;
                break;
            }
            command = scanner.nextLine();

        }

        if (command.equals("STOP") && sumCakes > 0){
            int cakesLeft = Math.abs(sumCakes);
            System.out.printf("%d pieces are left.",cakesLeft);
        }else {
            System.out.printf("No more cake left! You need %d pieces more.",Math.abs(cakeMissing));
        }


    }
}
