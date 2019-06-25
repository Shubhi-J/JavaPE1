package com.stackroute.pe1;

import java.util.Scanner;

public class RepeatNCharacters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a string");
        String inputString = input.nextLine();
        System.out.println("Please enter a number");
        int inputNum = input.nextInt();
//    String outputString="";
        int inputStringLength = inputString.length();
        if (inputNum <= inputStringLength) {
//            for (int outerLoopIndex = inputStringLength - 1; outerLoopIndex >= inputStringLength - inputNum; outerLoopIndex--) {
              for (int outerLoopIndex = 0; outerLoopIndex < inputNum; outerLoopIndex++) {
                for (int innerLoopIndex = inputStringLength - inputNum; innerLoopIndex < inputStringLength; innerLoopIndex++) {
                    inputString = inputString + inputString.charAt(innerLoopIndex);
                }
            }
            System.out.print(inputString);
        } else {
            System.out.print("Input number cannot be greater than the string size");
        }
    }
}
