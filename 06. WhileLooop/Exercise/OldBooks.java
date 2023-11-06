package WhileLooopWeek5.Exercise;

import java.util.Scanner;

public class OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String desiredBook = scanner.nextLine();
        String input = scanner.nextLine();
        int checkBooks = 0;
        while (!input.equals(desiredBook)){
                    if (input.equals("No More Books")){
                    System.out.println("The book you search is not here!");
                    System.out.printf("You checked %d books.",checkBooks);
                    break;
                }
            checkBooks ++;
            input = scanner.nextLine();
        }

        if (input.equals(desiredBook)){
            System.out.printf("You checked %d books and found it.",checkBooks);
        }

    }
}
