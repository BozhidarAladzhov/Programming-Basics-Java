package ConditionalStatementsAdvancedWeek3.Exercise;

import java.io.PrintStream;
import java.util.Scanner;

import static java.lang.System.*;

public class OperationsBetweenNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(in);

        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        String operation = scanner.nextLine();

        double result = 0;
        if (operation.equals("+")){
            result = n1 + n2;
        }else if (operation.equals("-")){
            result = n1 - n2;
        }else if (operation.equals("*")){
            result = n1 * n2;
        }else if (operation.equals("/")){
            result = (n1*1.0) / n2;
        }
        String typeNum = "";
        if (result % 2 == 0){
            typeNum = "even";
        }else{
            typeNum = "odd";
        }

        if (operation.equals("+") || operation.equals("-") || operation.equals("*")){
            out.printf("%d %s %d = %.0f - %s",n1,operation,n2,result,typeNum);
        } else if (operation.equals("/")){
            if (n2 == 0){
                out.printf("Cannot divide %d by zero",n1);
            }else{
                out.printf("%d %s %d = %.2f",n1,operation,n2,result);
            }
        }else if (operation.equals("%")) {
            if (n2 == 0){
                out.printf("Cannot divide %d by zero", n1);
            } else {
                result = n1 % n2;
                out.printf("%d %s %d = %.0f", n1, operation, n2, result);
            }
        }




    }
}
