package com.concurrency.framework.basic.local;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Created by mzavgorodny on 3/5/14.
 */
public class SafeTask implements Runnable {

    private static ThreadLocal<Date> startDate = new
            ThreadLocal<Date>() {
                protected Date initialValue() {
                    return new Date();
                }
            };


    @Override
    public void run() {
        System.out.printf("Safe starting Thread: %s : %s\n", Thread.
                currentThread().getId(), startDate.get());
        try {
            TimeUnit.SECONDS.sleep((int) Math.rint(Math.random() * 10));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.printf("Safe thread Finished: %s : %s\n", Thread.
                currentThread().getId(), startDate.get());
    }

}
