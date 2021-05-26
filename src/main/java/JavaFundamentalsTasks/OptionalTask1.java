package JavaFundamentalsTasks;

import java.util.Scanner;

public class OptionalTask1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Insert the numbers up to 10 symbols split by comma, please");
        String allNumbers = scan.nextLine();
        String allNumbersWithoutSpaces = allNumbers.replaceAll("\\s+", "");
        String[] splitNumbersArray = allNumbersWithoutSpaces.split(",");
        StringBuilder shortestNum = new StringBuilder(splitNumbersArray[0]);
        StringBuilder longestNum = new StringBuilder(splitNumbersArray[0]);


        for (int i = 0; i < splitNumbersArray.length; i++) {
            if (shortestNum.length() > splitNumbersArray[i].length()) {
                shortestNum.replace(0, 10, splitNumbersArray[i]);}
                else  if (longestNum.length() < splitNumbersArray[i].length()) {
                    longestNum.replace(0, 10, splitNumbersArray[i]);
                }
            }
        System.out.println("The shortest number is " + shortestNum + ", and the longest number is " + longestNum);
        }
    }
