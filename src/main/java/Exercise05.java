/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Magdalena Sobrino-Almanzar
 */
package exercise;

import java.util.Scanner;

public class Exercise05 {
    public static void main(String[] args) {

        int number1;
        int number2;

        Scanner input = new Scanner(System.in);

        System.out.print("What is the first number? ");// ask user for first number //
        number1 = input.nextInt();
        System.out.print("What is the second number? ");// ask user for second number //
        number2 = input.nextInt();

        int add = number1 + number2;
        int sub = number1 - number2;
        int mult = number1 * number2;
        int div = number1 / number2;

        System.out.print(number1 + " + " + number2 + " = " + add + "\n" +
                number1 + " - " + number2 + " = " + sub + "\n" +
                number1 + " * " + number2 + " = " + mult + "\n" +
                number1 + " / " + number2 + " = " + div + "\n");


    }
}
