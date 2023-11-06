package ForLoop.Exercise;

import java.util.Scanner;

public class Salary {

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        int numTabs = Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());

        for (int number = 1; number <= numTabs; number++){
            String tab = scanner.nextLine();

            if (tab.equals("Facebook") && salary > 0){
                salary = salary - 150;
            }else if (tab.equals("Instagram") && salary > 0) {
                salary = salary - 100;
            }else if (tab.equals("Reddit") && salary > 0){
                salary = salary - 50;
            }else {
                salary = salary;
            }

            if (salary <=0){
                System.out.println("You have lost your salary.");
                break;
            }

        }

        if (salary > 0){
            System.out.println(salary);
        }

    }
}
