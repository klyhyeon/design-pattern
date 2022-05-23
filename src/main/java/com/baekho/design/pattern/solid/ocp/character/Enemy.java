package com.baekho.design.pattern.solid.ocp.character;

public class Enemy implements Character {

    private PathPattern pathPattern;
    private int x;
    private int y;

    public Enemy(PathPattern pathPattern) {
        this.pathPattern = pathPattern;
    }

    @Override
    public void draw() {
        System.out.println("draw enemy");
//        if (pathPattern == 1) {
//            x += 4;
//            y += 6;
//        } else if (pathPattern == 2) {
//            x += 6;
//            y += 8;
//        }
        x = pathPattern.nextX();
        y = pathPattern.nextY();
    }

    public void drawSpecific() {
        System.out.println("draw specific enemy");
    }

}
