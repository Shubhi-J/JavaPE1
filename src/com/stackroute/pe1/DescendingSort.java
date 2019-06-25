package com.stackroute.pe1;

import java.util.Arrays;
import java.util.Scanner;

public class DescendingSort {
    public static void main(String[] args) {
        int sumOfEvenDigits = 0;
        String inputNum;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number");
        inputNum = input.nextLine();
        char ch[] = inputNum.toCharArray();
        Arrays.sort(ch);
        for (int i = ch.length-1; i >=0; i--) {
            int arrayIntElement =Character.getNumericValue(ch[i]);
            System.out.print(arrayIntElement);
            if(arrayIntElement%2==0) {
                sumOfEvenDigits=sumOfEvenDigits+arrayIntElement;
        }
        }
        System.out.println("The sum is "+sumOfEvenDigits);
        if (sumOfEvenDigits > 15) {
            System.out.print("true");
        } else {
            System.out.print("false");
        }
        }
    }


