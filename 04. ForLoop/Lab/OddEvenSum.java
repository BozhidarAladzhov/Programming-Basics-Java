package ForLoop.Lab;

import java.util.Scanner;

public class OddEvenSum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //Да се напише програма, която чете n-на брой цели числа
        int n = Integer.parseInt(scanner.nextLine());

        int sumEven = 0;
        int sumOdd = 0;

        for (int i = 1; i <= n; i++) {
            int num1 = Integer.parseInt(scanner.nextLine());

            if (i % 2 == 0 ){
                sumEven = sumEven + num1;
            }else {
                sumOdd = sumOdd + num1;
        }
        }


        if (sumEven == sumOdd) {
            System.out.println("Yes");
            System.out.printf("Sum = %d", sumOdd);
        }else {
            System.out.println("No");
            int diff = Math.abs(sumEven - sumOdd);
            System.out.printf("Diff = %d", diff);
        }
        // проверява дали сумата от числата на четни позиции е равна на сумата на числата на нечетни позиции.

        //•	Ако сумите са равни да се отпечатат два реда: "Yes" и на нов ред "Sum = " + сумата;
        // •Ако сумите не са равни да се отпечат два реда: "No" и на нов ред "Diff = " + разликата.
        // Разликата се изчислява по абсолютна стойност.

    }
}
