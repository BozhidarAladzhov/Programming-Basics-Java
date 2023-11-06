package MoreTrainingExercises;

import java.util.Scanner;

public class FuelTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fuel = scanner.nextLine();
        double qty = Double.parseDouble(scanner.nextLine());


        switch (fuel){
            case "Diesel":
                if (qty >= 25){
                    System.out.println("You have enough diesel.");
                }else {
                    System.out.println("Fill your tank with diesel!");
                }
                break;
            case "Gasoline":
                if (qty >= 25){
                    System.out.println("You have enough gasoline.");
                }else {
                    System.out.println("Fill your tank with gasoline!");
                }
                break;
            case "Gas":
                if (qty >= 25){
                    System.out.println("You have enough gas.");
                }else {
                    System.out.println("Fill your tank with gas!");
                }
                break;
            default:
                System.out.println("Invalid fuel!");
                break;
        }


    }
}
