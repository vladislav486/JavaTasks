package com.epam.automation;

import java.util.Scanner;

public class MainTaskJava4 {
    public static void main(String[] args) {
        int result = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Insert the numbers split by comma, please");
        String allNumbers = scan.nextLine();
        String allNumbersWithoutSpaces = allNumbers.replaceAll("\\s+", "");
        String [] arrayOfAllNumbers = allNumbersWithoutSpaces.split(",");
        for (int i = 0; i <= arrayOfAllNumbers.length - 1; i++) {
            result += Integer.parseInt(arrayOfAllNumbers[i]);
        }
        System.out.println("Sum of your number is " + result);
    }
}
