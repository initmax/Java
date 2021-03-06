package com.concurrency.framework.executors.controlfinishing;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/**
 * Created by mzavgorodny on 4/4/14.
 */
public class ExecutableTask implements Callable<String> {

    private String name;

    public String getName() {
        return name;
    }

    public ExecutableTask(String name) {
        this.name = name;
    }

    @Override
    public String call() throws Exception {
        try {
            long duration = (long) (Math.random() * 5) + 1;
            System.out.printf("%s: Waiting %d seconds for results.\n", this.name, duration);
            TimeUnit.SECONDS.sleep(duration);
        } catch (InterruptedException e) {
            System.out.println(name + " -> Launch canceled");
        }
        return name + " -> launched!";
    }

}
