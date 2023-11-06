package FirstStepsInCodingWeek1.Lab;

import java.util.Scanner;

public class ProjectsCreation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //създаване на конзола (скенер)

        String name = scanner.nextLine();
        int projects = Integer.parseInt(scanner.nextLine());

        //създаване на входящи данни
        int hours = projects * 3;
        //допълнителни данни
        System.out.printf("The architect %s will need %d hours to complete %s project/s.", name,hours,projects);
        //отпечатване на резултата
    }
}
