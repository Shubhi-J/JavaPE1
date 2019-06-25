package com.stackroute.pe1;

import java.util.Scanner;

public class LetterDigitSymbolChecker {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please give an input");
        char key= input.next().charAt(0);
        int intKey=(int)key;
        if(intKey >= 97 && intKey <=122) {
            System.out.print("small letter");
        } else if (intKey >= 65 && intKey <=90) {
            System.out.print("capital letter");
        } else if (intKey >= 48 && intKey <=57) {
            System.out.print("digit");
        } else {
        System.out.print("special symbol");
    }
    }

}
