package com.bqjr.utils.thread;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by YinLin on 2016/8/2.
 * Description :
 * Version 1.0
 */
public class NamedThreadFactory implements ThreadFactory {

    final ThreadGroup group;

    final AtomicInteger threadNumber = new AtomicInteger(1);

    final String namePrefix;

    public NamedThreadFactory(ThreadGroup group, String name) {
        this.group = group;
        this.namePrefix = group.getName() + ":" + name;
    }

    public NamedThreadFactory(String name) {
        this.group = new ThreadGroup(name);
        this.namePrefix = group.getName() + ":" + name;
    }

    @Override
    public Thread newThread(Runnable r) {
        return new Thread(group, r, namePrefix + threadNumber.getAndIncrement(), 0);
    }
}
