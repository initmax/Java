package com.concurrency.framework.collections.blocking.deque;

import java.util.concurrent.BlockingDeque;

/**
 * Created by mzavgorodny on 4/9/14.
 */
public class Producer2 implements Runnable {

    BlockingDeque<String> queue;

    Producer2(BlockingDeque<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        System.out.println("ProducerNoBlocking1 Started 1");
        try {
            for (int i = 1; i < 10; i++) {
                queue.add("ProducerNoBlocking2 = " + i);
                System.out.println("Added: ProducerNoBlocking2 = " + i);
                Thread.currentThread().sleep(800);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
