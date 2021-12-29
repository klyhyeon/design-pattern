package com.baekho.design.pattern.factory;

public abstract class EnemyFactory {
    public static EnemyFactory getFactory(int level) {
        if (level == 1) {
            return EasyStageEnemyFactory();
        } else {
            return HardEnemyFactory();
        }
    }

    //객체 생성을 위한 팩토리 메서드
    public abstract Boss createBoss();
    public abstract SmallFlight createSmallFlight();
    public abstract Obstacle createObstacle();
}
