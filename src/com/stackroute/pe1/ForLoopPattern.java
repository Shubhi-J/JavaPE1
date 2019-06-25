package com.stackroute.pe1;

public class ForLoopPattern {
    public static void main(String[] args) {
        int loopVariable=5;
        for(int outerLoopIndex=1;outerLoopIndex<=loopVariable;outerLoopIndex++) {
            for(int innerLoopIndex=1;innerLoopIndex<=outerLoopIndex;innerLoopIndex++) {
                System.out.print(outerLoopIndex);
            }
        }
    }
    }
