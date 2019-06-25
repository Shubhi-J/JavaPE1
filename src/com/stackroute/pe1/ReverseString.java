package com.stackroute.pe1;

public class ReverseString {
    public static void main (String[] args) {
        String inputString="london";
        String reverseString="";
        for(int loopIndex=inputString.length()-1;loopIndex>=0;loopIndex--) {
            reverseString= reverseString+ inputString.charAt(loopIndex);
        }
        System.out.print(reverseString);
    }
}
