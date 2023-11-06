package MoreTrainingExercises;

import java.util.Scanner;

public class TransportPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int kilometers = Integer.parseInt(scanner.nextLine());
        String text = scanner.nextLine();

        double sum = 0;

        if (kilometers < 20){
            if (text.equals("day")){
                sum = kilometers * 0.79 + 0.70;
            }else if (text.equals("night")){
                sum = kilometers * 0.90 + 0.70;
            }
        } else if (kilometers >= 20 && kilometers < 100){
            sum = kilometers * 0.09;
        }else {
            sum = kilometers * 0.06;
        }

        System.out.printf("%.2f", sum);







    }
}
