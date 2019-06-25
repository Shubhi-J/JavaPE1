package com.stackroute.pe1;

import java.util.Scanner;

public class AddUnspecifiedNumbers {
        public static void main(String[] args)
        {
            int noOfElements, sum = 0;
            Scanner input = new Scanner(System.in);
            System.out.print("Enter no. of elements you want in array:");
            noOfElements = input.nextInt();
            int inputArray[] = new int[noOfElements];
            System.out.println("Enter all the elements:");
//            if(!input.hasNextInt()){
//                System.out.println("Entered input is not integer,Please give an integer");
//               // input.next();
//             }
            // input.nextInt();
            try {
                while (input.hasNextInt()) {
                    for (int loopIndex = 0; loopIndex < noOfElements; loopIndex++) {
                        inputArray[loopIndex] = input.nextInt();
                        sum = sum + inputArray[loopIndex];

                    }
                    System.out.println("Sum:" + sum);
                }
            } catch (Exception e) {
                System.out.print("Please enter integer input");
        }


            }
        }


