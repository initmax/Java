package com.concurrency.framework.basic.exceptions;

/**
 * Created by mzavgorodny on 3/5/14.
 */
public class Main {

    /**
     * Example how to caught unchecked exception
     *
     * @param args
     * @throws InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        ExceptionTask task = new ExceptionTask();
        Thread thread = new Thread(task);
        thread.setUncaughtExceptionHandler(new ExceptionHandler());
        thread.start();
        System.out.print("MainUnsafe thread finished");
    }
}
