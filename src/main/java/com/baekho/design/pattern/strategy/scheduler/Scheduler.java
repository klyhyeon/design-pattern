package com.baekho.design.pattern.strategy.scheduler;

public interface Scheduler {

    void getNextCall();
    void sendCallToAgent();
}
