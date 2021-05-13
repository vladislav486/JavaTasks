package com.epam.automation;

import java.util.Random;
import java.util.Scanner;

public class MainTaskJava3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insert the amount of numbers, please");
        int amountOfNumbers = scan.nextInt();
        byte [] arrayOfNumbers = new byte[amountOfNumbers];
        final Random random = new Random();
        random.nextBytes(arrayOfNumbers);
        for (int i = 0; i <=arrayOfNumbers.length - 1;i++){
            System.out.print(arrayOfNumbers[i] + " ");
        }
        System.out.println();
            for (int i = 0; i <=arrayOfNumbers.length - 1;i++){
                System.out.println(arrayOfNumbers[i]);
            }
        }
    }
