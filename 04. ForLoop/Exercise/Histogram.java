package ForLoop.Exercise;

import java.util.Scanner;

public class Histogram {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int countNumbers = Integer.parseInt(scanner.nextLine());

        int count1 =0;
        int count2 =0;
        int count3 =0;
        int count4 =0;
        int count5 =0;


        for (int number = 1; number <= countNumbers; number++) {
            int currentNumber = Integer.parseInt(scanner.nextLine());

            if (currentNumber < 200) {
                count1++;

            } else if (currentNumber >= 200 && currentNumber <= 399) {
                count2++;

            } else if (currentNumber >= 400 && currentNumber <= 599) {
                count3++;

            } else if (currentNumber >= 600 && currentNumber <= 799) {
                count4++;

            } else if (currentNumber >= 800) {
                count5++;

            }
        }


            double p1 = count1 * 1.0 / countNumbers * 100;
            System.out.printf("%.2f%%%n",p1);
            double p2 = count2 * 1.0 / countNumbers * 100;
            System.out.printf("%.2f%%%n",p2);
            double p3 = count3 *1.0 / countNumbers * 100;
            System.out.printf("%.2f%%%n",p3);
            double p4 = count4 * 1.0 / countNumbers * 100;
            System.out.printf("%.2f%%%n",p4);
            double p5 = count5 * 1.0 / countNumbers * 100;
            System.out.printf("%.2f%%%n",p5);


    }
}
