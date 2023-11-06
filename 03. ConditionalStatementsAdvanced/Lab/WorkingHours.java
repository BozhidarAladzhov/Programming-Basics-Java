package ConditionalStatementsAdvancedWeek3.Lab;

import java.util.Scanner;

public class WorkingHours {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        String day = scanner.nextLine();

        boolean isWorkingDay = day.equals("Monday") ||
                day.equals("Tuesday") ||
                day. equals("Wednesday") ||
                day.equals("Thursday") ||
                day.equals("Friday") ||
                day.equals("Saturday");
        boolean isWorkingHour = hour >= 10 && hour <= 18;

        if (isWorkingDay && isWorkingHour){
            System.out.println("open");
        } else {
            System.out.println("closed");
        }

        }
    }



