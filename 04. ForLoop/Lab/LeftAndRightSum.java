package ForLoop.Lab;


import java.util.Scanner;

public class LeftAndRightSum {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int leftSum = 0;

        for (int i = 1; i <=n; i++) {
            int num1 = Integer.parseInt(scanner.nextLine());
            leftSum = leftSum + num1;

        }

        int rightSum = 0;
        for (int i = 1; i <=n; i++) {
            int num1 = Integer.parseInt(scanner.nextLine());
            rightSum = rightSum + num1;
        }

        if (leftSum == rightSum){
            System.out.printf("Yes, sum = %d%n", rightSum);
        }else {
            int diff = Math.abs(leftSum - rightSum);
            System.out.printf("No, diff = %d",diff);
        }





    }
}
