package NestedLoopWeek6.Exercise;

import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 2; i <= 9; i++) { // първата цифричка на числото
            for (int j = 2; j <= 9; j++) { // втората
                for (int k = 2; k <= 9; k++) { // третата
                    for (int l = 2; l <= 9; l++) { // четвъртата
                        if (n % i == 0 && n % j == 0 && n % k == 0 && n % l == 0) {
                            System.out.printf("%d%d%d%d ", i, j, k, l);
                        }
                    }
                }
            }
        }

    }
}
