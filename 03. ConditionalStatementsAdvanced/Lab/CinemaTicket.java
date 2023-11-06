package ConditionalStatementsAdvancedWeek3.Lab;

import java.util.Scanner;

public class CinemaTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String day = scanner.nextLine();

        int ticket = 0;
        if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Friday")){
            ticket = 12;
        }else if (day.equals("Wednesday") || day.equals("Thursday")){
            ticket = 14;
        }else if (day.equals("Saturday") || day.equals("Sunday")){
            ticket = 16;
        }
        System.out.println(ticket);
    }
}
