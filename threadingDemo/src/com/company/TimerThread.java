package com.company;

import javax.swing.plaf.synth.SynthTextAreaUI;

public class TimerThread implements Runnable{

    private Thread thread;
    private String threadName;

    public TimerThread(String threadName){
        this.threadName = threadName;
        System.out.println("Being Created: " + threadName);
    }

    @Override
    public void run() {
        System.out.println("Running: " + threadName);
        try {
            for (int i = 1; i <= 25; i++) {
                System.out.println(threadName + ":" + i);
                Thread.sleep(1000);
            }
        }catch(InterruptedException exception){
            System.out.println(":" + threadName);
        }
        System.out.println("Finished:  " +threadName);
        }

        public void start(){
        System.out.println("Thread is created");
        if(thread == null){
            thread = new Thread(this, threadName);
            thread.start();
        }
    }
}
