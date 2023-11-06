package MoreTrainingExercises;

import java.util.Scanner;

public class Pets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // куче, котка, костенурка

        // колко общо храна ще трябва да остави

        int days = Integer.parseInt(scanner.nextLine()); // дни
        int foodLeft = Integer.parseInt(scanner.nextLine()); // общо оставена храна
        double foodDog = Double.parseDouble(scanner.nextLine()); // кучето яде на ден КИЛОГРАМИ
        double foodCat = Double.parseDouble(scanner.nextLine()); // котката яде на ден КИЛОГРАМИ
        double foodTurtle = Double.parseDouble(scanner.nextLine()); // костенурката яде на ден ГРАМА

        double sumFoodDog = days * foodDog;
        double sumFoodCat = days * foodCat;
        double sumFoodTurtle = (days * foodTurtle) / 1000;
        double totalSumFood = sumFoodCat + sumFoodDog + sumFoodTurtle;

        if (totalSumFood <= foodLeft){
            System.out.printf("%.0f kilos of food left.",Math.floor(foodLeft - totalSumFood));
        }else {
            System.out.printf("%.0f more kilos of food are needed.", Math.ceil(totalSumFood - foodLeft));
        }



    }
}
