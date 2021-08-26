package com.bridgelabz;

import java.util.Scanner;

public class CouponNumber {
    public void couponNumber() {
        System.out.print("Enter the number: ");
        Scanner numberScan = new Scanner(System.in);
        int number = numberScan.nextInt();
        int number1 = 62;
        int count = 0;

        while (number != number1)
        {
            number1 = (int) Math.floor(Math.random() * 100);
            count++;
            System.out.println(number+" " +number1);
            System.out.println("Attempts : " + count);
        }
    }
}
