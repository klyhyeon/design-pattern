package com.baekho.design.pattern.solid.ocp.character;

public class Player implements Character {

    @Override
    public void draw() {
        System.out.println("draw player");
    }

    @Override
    public void drawSpecific() {
        System.out.println("draw specific player");
    }
}
