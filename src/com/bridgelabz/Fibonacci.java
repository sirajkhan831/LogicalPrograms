package com.bridgelabz;

import java.util.Scanner;

public class Fibonacci {

    public void fibonacci() {

        System.out.println("Enter the length of series to be printed : ");
        Scanner lengthScan = new Scanner(System.in);
        int length = lengthScan.nextInt();
        int firstNum = 0, secondNum = 1;
        int upcomingNum;
        System.out.print(firstNum + " " + secondNum);

        for (int i = 2; i < length; i++) {
            upcomingNum = firstNum + secondNum;
            System.out.print(" " + upcomingNum);
            firstNum = secondNum;
            secondNum = upcomingNum;
        }
    }
}