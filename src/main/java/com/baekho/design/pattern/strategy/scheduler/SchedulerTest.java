package com.baekho.design.pattern.strategy.scheduler;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class SchedulerTest {

    public static void main(String[] args) throws IOException {
        System.out.println("전화 상담 방식을 선택하세요.");
        System.out.println("R: 순서대로 할당");
        System.out.println("L: 쉬고 있거나 대기가 적은 상담원에게 할당");
        System.out.println("P: 우선순위가 높은 고객 먼저 할당");

        String ch = String.valueOf((char) System.in.read()).toUpperCase();
        Scheduler scheduler = null;

        Map<String, Scheduler> subClassMap = new HashMap<>();
        subClassMap.put("R", new RoundRobin());
        subClassMap.put("L", new LeastJob());
        subClassMap.put("P", new PriorityAllocation());

        scheduler =  subClassMap.get(ch);
        if (scheduler == null) {
            System.out.println("올바르지 않은 입력입니다.");
            return;
        }
        scheduler.getNextCall();
        scheduler.sendCallToAgent();
    }
}
