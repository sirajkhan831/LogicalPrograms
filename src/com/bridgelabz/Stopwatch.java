package com.bridgelabz;

import java.util.Locale;
import java.util.Scanner;

public class Stopwatch {

    public void stopwatch(){
        double totalTime;
        double startTime = 0;
        double stopTime = 0;
        System.out.println("Type start to start the clock : ");
        Scanner startScan = new Scanner(System.in);
        String start = startScan.nextLine().toLowerCase(Locale.ROOT);
        if (start.equals("start"))
        {
            startTime = System.currentTimeMillis();
        }
        System.out.println("Type stop to stop the clock : ");
        Scanner stopScan = new Scanner(System.in);
        String stop = startScan.nextLine().toLowerCase(Locale.ROOT);
        if (stop.equals("stop"))
        {
            stopTime = System.currentTimeMillis();
        }
        totalTime = stopTime - startTime;
        System.out.println("The total time between start and stop was "+(double)(totalTime/1000) + " seconds.");
    }
}
