package com.bridgelabz;

import java.util.Scanner;

public class ReverseNumber {
    public void reverseNumber() {
        System.out.println("Enter Number : ");
        Scanner numberScan = new Scanner(System.in);
        int number = numberScan.nextInt();
        int num = number;
        int count = 1;
        while (number > 10) {
            number = number / 10;
            count++;
        }
        int store;
        for (int i = 1; i <= count; i++) {
            store = num % 10;
            num = num / 10;
            System.out.print(store);
            store = 0;
        }
    }
}