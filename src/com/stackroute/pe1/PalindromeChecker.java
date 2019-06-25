package com.stackroute.pe1;

public class PalindromeChecker {
        public static void main(String args[]){
            int remainder,sum=0,temp,r=0,sumOfEvenDigits=0;
            int inputNum=88988;//It is the number variable to be checked for palindrome

            temp=inputNum;
            while(inputNum>0){
                remainder=inputNum%10;  //getting remainder
                sum=(sum*10)+remainder;
                inputNum=inputNum/10;
            }
            if(temp==sum) {
                System.out.print("Given number is a palindrome number");
                while (temp > 0) {
                    r = temp % 10;
                    if (r % 2 == 0) {
                        sumOfEvenDigits = sumOfEvenDigits + r;
                    }
                    temp = temp / 10;
                }
                if (sumOfEvenDigits < 25) {
                    System.out.print(" and sum of even numbers is less than 25");
                } else if (sumOfEvenDigits > 25) {
                    System.out.print(" and sum of even numbers is greater than 25");
                } else {
                    System.out.print(" and sum of even numbers is equals to 25");
                }
            }
            else
                System.out.println("not palindrome");
        }
    }
