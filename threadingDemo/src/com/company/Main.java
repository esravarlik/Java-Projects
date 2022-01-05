package com.company;

public class Main {

    public static void main(String[] args) {
        TimerThread thread1 = new TimerThread("thread1");
        TimerThread thread2 = new TimerThread("thread2");
        TimerThread thread3 = new TimerThread("thread3");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
