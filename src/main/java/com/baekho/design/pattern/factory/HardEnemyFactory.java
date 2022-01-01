package com.baekho.design.pattern.factory;

import com.baekho.design.pattern.factory.boss.Boss;
import com.baekho.design.pattern.factory.flight.SmallFlight;
import com.baekho.design.pattern.factory.obstacle.Obstacle;

public class HardEnemyFactory extends EnemyFactory {
    @Override
    public Boss createBoss() {
        return null;
    }

    @Override
    public SmallFlight createSmallFlight() {
        return null;
    }

    @Override
    public Obstacle createObstacle() {
        return null;
    }
}
