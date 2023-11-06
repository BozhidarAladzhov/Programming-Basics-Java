package ConditionalStatementsWeek2.Lab;

import java.util.Scanner;

public class ExcellentResult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rating = Integer.parseInt(scanner.nextLine());

        if (rating >= 5) {
            System.out.println("Excellent!");
        }

    }
}
