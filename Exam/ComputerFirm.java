package Exam;

import java.util.Scanner;

public class ComputerFirm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int computers = Integer.parseInt(scanner.nextLine());
        int rating = 0;
        double possibleSales = 0;
        double ratingCounter = 0;
        double sales = 0;


        for (int i = 1; i <= computers ; i++) {
            int input = Integer.parseInt(scanner.nextLine());
            rating = input % 10;
            ratingCounter += rating;
            possibleSales = Math.floor(input / 10.0);

            if (rating == 2){
                sales += possibleSales * 0;
            }else if (rating == 3){
                sales += possibleSales * 0.5;
            }else if (rating == 4){
                sales += possibleSales * 0.7;
            }else if (rating == 5){
                sales += possibleSales * 0.85;
            }else if (rating == 6){
                sales += possibleSales * 1;
            }


        }

        System.out.printf("%.2f%n", sales);
        System.out.printf("%.2f", ratingCounter / computers);

    }
}
