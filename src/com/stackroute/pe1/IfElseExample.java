package com.stackroute.pe1;

import java.util.Scanner;

public class IfElseExample {
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.println("Please enter a number");
    int num= input.nextInt();

    if(num >=20 && num <=30) {
        if (num % 2 != 0) {
            System.out.println("Tom");
        } else {
            System.out.println("jerry");
        }
    } else {
        System.out.println("Number is not between 20 and 30");
    }
    }
}

