package ConditionalStatementsAdvancedWeek3.Lab;

import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        String day = scanner.nextLine();
        double qty = Double.parseDouble(scanner.nextLine());

        boolean dayCheck =  day.equals("Monday") || day.equals("Tuesday") ||
                day.equals("Wednesday") ||
                day.equals("Thursday") ||
                day.equals("Friday") || day.equals("Saturday") || day.equals("Sunday");
        boolean productCheck = product.equals("banana") || product.equals("apple") || product.equals("orange") ||
                        product.equals("grapefruit") || product.equals("kiwi") ||
                        product.equals("pineapple") || product.equals("grapes");


        double price = 0.0;
        if (day.equals("Monday") || day.equals("Tuesday") ||
                day.equals("Wednesday") ||
                day.equals("Thursday") ||
                day.equals("Friday")){
            if(product.equals("banana")){
                price = 2.50;
            }else if (product.equals("apple")){
                price = 1.20;
            }else if (product.equals("orange")){
                price = 0.85;
            }else if (product.equals("grapefruit")){
                price =1.45;
            } else if (product.equals("kiwi")){
                price =2.70;
            }else if (product.equals("pineapple")){
                price = 5.50;
            } else if (product.equals("grapes")){
                price = 3.85;
            }
        } else if (day.equals("Saturday") || day.equals("Sunday")){
            if(product.equals("banana")){
                price = 2.70;
            }else if (product.equals("apple")){
                price = 1.25;
            }else if (product.equals("orange")){
                price = 0.90;
            }else if (product.equals("grapefruit")){
                price = 1.60;
            } else if (product.equals("kiwi")){
                price = 3.00;
            }else if (product.equals("pineapple")){
                price = 5.60;
            } else if (product.equals("grapes")){
                price = 4.20;
            }
        }
        if (dayCheck && productCheck){
            double sum = (qty * price);
            System.out.printf("%.2f", sum);
        }else {
            System.out.println("error");
        }



    }
}
