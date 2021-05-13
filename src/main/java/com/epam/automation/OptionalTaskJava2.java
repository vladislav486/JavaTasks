package com.epam.automation;

import java.util.Scanner;

public class OptionalTaskJava2 {
    public static void main(String[] args) {
        int sumOfAllNumbers = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Insert the numbers split by comma, please");
        String allNumbers = scan.nextLine();
        String allNumbersWithoutSpaces = allNumbers.replaceAll("\\s+", "");
        String[] splitNumbersArray = allNumbersWithoutSpaces.split(",");
        for (int i = 0; i < splitNumbersArray.length; i++){
            sumOfAllNumbers +=splitNumbersArray[i].length();
        }
        double averageOfNumbersAmount = sumOfAllNumbers / splitNumbersArray.length;
        System.out.print("Here are all long numbers from your list : ");
        for (int i = 0; i < splitNumbersArray.length; i++){
            if (splitNumbersArray[i].length() > averageOfNumbersAmount){
                System.out.print(splitNumbersArray[i] + "; ");
            }
        }
    }
}
