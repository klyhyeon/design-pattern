package com.baekho.design.pattern.factory;

import com.baekho.design.pattern.factory.boss.Boss;
import com.baekho.design.pattern.factory.flight.SmallFlight;
import com.baekho.design.pattern.factory.obstacle.Obstacle;

public abstract class EnemyFactory {
    public static EnemyFactory getFactory(int level) {
        if (level == 1) {
            return new EasyStageEnemyFactory();
        } else {
            return new HardEnemyFactory();
        }
    }

    //객체 생성을 위한 팩토리 메서드
    public abstract Boss createBoss();
    public abstract SmallFlight createSmallFlight();
    public abstract Obstacle createObstacle();
}
