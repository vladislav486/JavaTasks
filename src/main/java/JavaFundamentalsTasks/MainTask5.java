package JavaFundamentalsTasks;

import java.util.Scanner;

public class MainTask5 {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insert the number of month please");
        int numberOfMonth = scan.nextInt();
        if (numberOfMonth > 12 || numberOfMonth < 1){
            throw new Exception("Insert numbers from 1 to 12, please");
        }
        switch (numberOfMonth){

            case 1:
                System.out.println("Your month is January");
                break;
            case 2:
                System.out.println("Your month is February");
                break;
            case 3:
                System.out.println("Your month is March");
                break;
            case 4:
                System.out.println("Your month is April");
                break;
            case 5:
                System.out.println("Your month is May");
                break;
            case 6:
                System.out.println("Your month is June");
                break;
            case 7:
                System.out.println("Your month is July");
                break;
            case 8:
                System.out.println("Your month is August");
                break;
            case 9:
                System.out.println("Your month is September");
                break;
            case 10:
                System.out.println("Your month is October");
                break;
            case 11:
                System.out.println("Your month is November");
                break;
            case 12:
                System.out.println("Your month is December");
                break;
        }
    }
}
