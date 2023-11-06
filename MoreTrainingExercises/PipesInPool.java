package MoreTrainingExercises;

import java.util.Scanner;

public class PipesInPool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int capacity = Integer.parseInt(scanner.nextLine()); // обем на басейна в литри
        int debit1 = Integer.parseInt(scanner.nextLine()); // дебит на първа тръба ( литри за час)
        int debit2 = Integer.parseInt(scanner.nextLine()); // дебит на втора тръба ( литри за час)
        double hours = Double.parseDouble(scanner.nextLine()); // часове в които работника го няма

        double sumDebit1 = hours * debit1;
        double sumDebit2 = hours * debit2;
        double sumDebit = sumDebit1 + sumDebit2;

        if (capacity > sumDebit){
            double percentFull = sumDebit * 100 / capacity;
            double percentDebit1 = sumDebit1 * 100 / sumDebit;
            double percentDebit2 = sumDebit2 * 100 / sumDebit;
            System.out.printf("The pool is %.2f%% full. Pipe 1: %.2f%%. Pipe 2: %.2f%%.", percentFull,percentDebit1,percentDebit2);
        }else {
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.", hours, sumDebit - capacity);
        }



    }
}
