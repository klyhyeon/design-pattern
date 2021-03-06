package com.baekho.design.pattern.strategy.scheduler;

public class PriorityAllocation implements Scheduler {

    @Override
    public void getNextCall() {
        System.out.println("고객 등급이 높은 전화부터 가져옵니다.");
    }

    @Override
    public void sendCallToAgent() {
        System.out.println("업무 스킬이 높은 상담원에게 우선 배분합니다.");
    }
}
