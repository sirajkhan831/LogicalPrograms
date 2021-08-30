package com.bridgelabz;

import java.util.Scanner;

public class CouponNumber {
    public void couponNumber() {
        Scanner sd = new Scanner(System.in);
        System.out.print("Enter number :");
        int num = sd.nextInt();
        int[] Array = new int[num];

        for(int i=0;i<num;i++) {

            int check =(int) (Math.random()*1000000) %1000000;
            System.out.println(check );
            for(int j=0;j<num;j++) {
                if (Array[i] != Array[j]) {
                    Array[i] = check;
                    break;
                }
            }
        }
        for(int i=0;i<num;i++) {
            System.out.println(Array[i]);
        }
    }
}
