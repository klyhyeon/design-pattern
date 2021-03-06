package com.baekho.design.pattern.factory;

import com.baekho.design.pattern.factory.boss.Boss;
import com.baekho.design.pattern.factory.boss.StrongAttackBoss;
import com.baekho.design.pattern.factory.flight.DashSmallFlight;
import com.baekho.design.pattern.factory.flight.SmallFlight;
import com.baekho.design.pattern.factory.obstacle.Obstacle;
import com.baekho.design.pattern.factory.obstacle.RockObstacle;

public class EasyStageEnemyFactory extends EnemyFactory {

    @Override
    public Boss createBoss() {
        return new StrongAttackBoss();
    }

    @Override
    public SmallFlight createSmallFlight() {
        return new DashSmallFlight();
    }

    @Override
    public Obstacle createObstacle() {
        return new RockObstacle();
    }
}
