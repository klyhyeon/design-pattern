package com.baekho.design.pattern.factory;

import com.baekho.design.pattern.factory.boss.Boss;
import com.baekho.design.pattern.factory.flight.SmallFlight;
import com.baekho.design.pattern.factory.obstacle.Obstacle;

import java.io.InputStream;

public class Stage {

    private EnemyFactory enemyFactory;
    private int stageLevel;
    private SmallFlight[] enemies;
    private Obstacle[] obstacles;
    private Boss boss;
    private static final int ENEMY_COUNT = 5;
    private static final int OBSTACLE_COUNT = 5;

    public Stage(int level, EnemyFactory enemyFactory) {
//        enemyFactory = EnemyFactory.getFactory(level);
        //DI를 적용하면 getFactory를 EnemyFactory에 구현할 필요가 없습니다.
        this.stageLevel = level;
        this.enemyFactory = enemyFactory;
    }

    private void createEnemies() {
        for (int i = 0; i<= ENEMY_COUNT; i++) {
            enemies[i] = enemyFactory.createSmallFlight();
        }
        boss = enemyFactory.createBoss();
    }

    private void createObstacle() {
        for (int i = 0; i <= OBSTACLE_COUNT; i++) {
            obstacles[i] = enemyFactory.createObstacle();
        }
    }

//    public Stage(int stageLevel) {
//        this.stageLevel = stageLevel;
//    }
//
//    private void createEnemies() {
//        for (int i = 0; i <= ENEMY_COUNT; i++) {
//            if (stageLevel == 1) {
//                enemies[i] = new DashSmallFilight(1, 1); //공격/수비력 1
//            } else if (stageLevel == 2) {
//                enemies[i] = new MissileSmallFlight(1, 1);
//            }
//        }
//        if (stageLevel == 1) {
//            boss = new StringAttackBoss(1, 10);
//        } else if (stageLevel == 2) {
//            boss = new CloningBoss(5, 20);
//        }
//    }
//
//    private void createObstacle() {
//        for (int i = 0; i < OBSTACLE_COUNT; i++) {
//            if (stageLevel == 1) {
//                obstacles[i] = new RockObstacle();
//            } else {
//                obstacles[i] = new BombObstacle();
//            }
//        }
//    }
}
