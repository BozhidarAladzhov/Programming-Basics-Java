package ForLoop.Exercise;

import java.util.Scanner;

public class TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int groups = Integer.parseInt(scanner.nextLine());
        int hikers1 =0;
        int hikers2 =0;
        int hikers3 =0;
        int hikers4 =0;
        int hikers5 =0;

        for (int num = 1; num <= groups; num++) {
            int numHikers = Integer.parseInt(scanner.nextLine());

            if (numHikers <= 5 && numHikers >0){ // Мусала
                    hikers1 += numHikers;
            }else if (numHikers >=6 && numHikers <= 12){ //Монблан
                    hikers2 += numHikers;
            }else if (numHikers >=13 && numHikers <= 25){ //Килиманджаро
                    hikers3 += numHikers;
            }else if (numHikers >= 26 && numHikers <= 40){ //К2
                    hikers4 += numHikers;
            }else if (numHikers >= 41){ //Еверест
                    hikers5 += numHikers;
            }
        }

        double sumHikers = hikers1 + hikers2 + hikers3 + hikers4 + hikers5;
        double percentHikers1 = hikers1 / sumHikers * 100;
        double percentHikers2 = hikers2 / sumHikers * 100;
        double percentHikers3 = hikers3 / sumHikers * 100;
        double percentHikers4 = hikers4 / sumHikers * 100;
        double percentHikers5 = hikers5 / sumHikers * 100;

        System.out.printf("%.2f%%%n",percentHikers1);
        System.out.printf("%.2f%%%n",percentHikers2);
        System.out.printf("%.2f%%%n",percentHikers3);
        System.out.printf("%.2f%%%n",percentHikers4);
        System.out.printf("%.2f%%%n",percentHikers5);



    }
}
