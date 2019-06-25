package com.stackroute.pe1;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        int originalNumber= 38;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the guessed number in the range of 1 to 50");
        int guessedNum = input.nextInt();
        if (guessedNum >= 1 && guessedNum <= 50) {

            if(guessedNum>originalNumber) {
                System.out.print("Number guessed is greater than the original number");
            } else if(guessedNum<originalNumber) {
                System.out.print("Number guessed is less than the original number");
            } else {
                System.out.print("Number guessed matches the original number");
            }
        } else {
            System.out.print("The guessed number is out to range(that is 1 to 50)");
        }
    }

}
