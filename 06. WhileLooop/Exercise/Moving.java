package WhileLooopWeek5.Exercise;

import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int widthSpace = Integer.parseInt(scanner.nextLine());
        int lengthSpace = Integer.parseInt(scanner.nextLine());
        int heightSpace = Integer.parseInt(scanner.nextLine());
        int spaceCm3 = widthSpace * lengthSpace * heightSpace;


        int spaceLeft = 0;
        int spaceNeed =0;
        String command = scanner.nextLine();

        while (!command.equals("Done")){
            int boxes = Integer.parseInt(command);
            spaceCm3 -= boxes;

            if (spaceCm3 <0){
               spaceNeed = Math.abs(spaceCm3);
                System.out.printf("No more free space! You need %d Cubic meters more.",spaceNeed);
                break;
            }
            command = scanner.nextLine();

        }

        if (command.equals("Done")){
            spaceLeft=spaceCm3;
            System.out.printf("%d Cubic meters left.",spaceLeft);
        }


    }
}
