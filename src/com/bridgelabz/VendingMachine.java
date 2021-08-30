package com.bridgelabz;

import java.util.Scanner;

public class VendingMachine {
    private static int notes = 0;
    private static int money = 0;

    public void vendingMachine() {
        System.out.println("Please enter the required amount : ");
        money = new Scanner(System.in).nextInt();
        int store1000 = check1000();
        int store500 = check500();
        int store100 = check100();
        int store50 = check50();
        int store20 = check20();
        int store10 = check10();
        System.out.println("Minimum number of notes that can be returned by the vending machine  : " + notes);
        if (store1000 > 0)
        {
            System.out.println("Number of 1000 INR notes are : "+store1000);
        }
        if (store500 > 0)
        {
            System.out.println("Number of 500 INR notes are : "+store500);
        }
        if (store100 > 0)
        {
            System.out.println("Number of 100 INR notes are : "+store100);
        }
        if (store50 > 0)
        {
            System.out.println("Number of 50 INR notes are : "+store50);
        }
        if (store20 > 0)
        {
            System.out.println("Number of 20 INR notes are : "+store20);
        }
        if (store10 > 0)
        {
            System.out.println("Number of 10 INR notes are : "+store10);
        }
    }

    private static int check1000() {
        int notesT;
        if (money >= 1000) {
            notesT = money / 1000;
            notes = money / 1000;
            money = money - (notes * 1000);
            return notesT;
        }
        return 0;
    }

    private static int check500() {
        int notesF;
        if (money >= 500) {
            notesF = money / 500;
            money = money - (notesF * 500);
            notes = notesF + notes;
            return notesF;
        }
        return 0;
    }

    private static int check100() {
        int notesH;
        if (money >= 100) {
            notesH = money / 100;
            money = money - (notesH * 100);
            notes = notesH + notes;
            return notesH;
        }
        return 0;
    }

    private static int check50() {
        int notesFif;
        if (money >= 50) {
            notesFif = money / 50;
            money = money - (notesFif * 50);
            notes = notesFif + notes;
            return notesFif;
        }
        return 0;
    }

    private static int check20() {
        int notesTw;
        if (money >= 20) {
            notesTw = money / 20;
            money = money - (notesTw * 20);
            notes = notesTw + notes;
            return notesTw;
        }
        return 0;
    }

    private static int check10() {
        int notesTen;
        if (money >= 10) {
            notesTen = money / 10;
            money = money - (notesTen * 10);
            notes = notesTen + notes;
            return notesTen;
        }
        return 0;
    }
}
