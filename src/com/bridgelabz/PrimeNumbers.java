package com.bridgelabz;

import java.util.Scanner;

public class PrimeNumbers {

    public void prime() {
        System.out.println("Enter Number : ");
        Scanner numberScan = new Scanner(System.in);
        int number = numberScan.nextInt();
        int flag = 0;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                flag = 1;
                break;
            }
        }
        if (flag == 1) {
            System.out.println("Given number is NOT a PRIME number.");
        } else System.out.println("Given number is a PRIME number.");
    }
}
