package com.epam.automation;

import java.util.Random;
import java.util.Scanner;

public class OptionalTask3 {
    public static void main(String[] args) {
        int unnecessaryColumn = 0;
        int unnecessaryLine = 0;
        final Random random = new Random();
        Scanner scan = new Scanner(System.in);
        System.out.println("Insert matrix size, please");
        int matrixSize = scan.nextInt();
        int arrayOfRandomNumbers [] [] = new int[matrixSize][matrixSize];
        for (int i = 0; i < arrayOfRandomNumbers.length; i++) {
            for (int j = 0; j < arrayOfRandomNumbers.length; j++){
                arrayOfRandomNumbers[i] [j] = random.nextInt();
            }
        } int maxNumberOfMatrix = arrayOfRandomNumbers[0] [0];
        for (int i = 0; i < arrayOfRandomNumbers.length; i++) {
            for (int j = 0; j < arrayOfRandomNumbers.length; j++) {
                if(maxNumberOfMatrix < arrayOfRandomNumbers[i] [j]){
                    maxNumberOfMatrix = arrayOfRandomNumbers[i] [j];
                    unnecessaryColumn = i;
                    unnecessaryLine = j;
                }
                System.out.print(arrayOfRandomNumbers[i] [j] + "; ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < arrayOfRandomNumbers.length; i++) {
            for (int j = 0; j < arrayOfRandomNumbers.length; j++) {
                if (i == unnecessaryColumn || j == unnecessaryLine){
                    arrayOfRandomNumbers[i] [j] = 0;
                }
                System.out.print(arrayOfRandomNumbers[i] [j] + " ");
            }
            System.out.println();
        }
        System.out.println("Max number is " + maxNumberOfMatrix);
    }
}
