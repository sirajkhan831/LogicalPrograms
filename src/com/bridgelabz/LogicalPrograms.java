package com.bridgelabz;

import java.util.Scanner;

public class LogicalPrograms {

    public static void main(String[] args) {
        System.out.println("Enter choice of program : 1.Prime Number 2.Fibonacci 3.Reverse Number 4.Perfect Number 5.Coupon Number 6.Stopwatch");
        Scanner optionScan = new Scanner(System.in);
        int option = optionScan.nextInt();

        switch (option) {
            case 1 -> {
                PrimeNumbers primeNumbers = new PrimeNumbers();
                primeNumbers.prime();
            }
            case 2 -> {
                Fibonacci fibonacci = new Fibonacci();
                fibonacci.fibonacci();
            }
            case 3 -> {
                ReverseNumber reverseNumber = new ReverseNumber();
                reverseNumber.reverseNumber();
            }
            case 4 -> {
                PerfectNumber perfectNumber = new PerfectNumber();
                perfectNumber.perfectNumber();
            }
            case 5 -> {
                CouponNumber couponNumber = new CouponNumber();
                couponNumber.couponNumber();
            }
            case 6 -> {
                Stopwatch stopwatch = new Stopwatch();
                stopwatch.stopwatch();
            }
        }
    }
}
