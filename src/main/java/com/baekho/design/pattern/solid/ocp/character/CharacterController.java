package com.baekho.design.pattern.solid.ocp.character;

public class CharacterController {

    public void drawCharacter(Character character) {
        if (character instanceof Enemy) {
            //Character에서 처리해주는 게 맞다
            Enemy enemy = (Enemy) character;
            enemy.drawSpecific();
        } else if (character instanceof Missile) {
            //폐쇄에 적합하지 않은 방식
            Missile missile = (Missile) character;
        } else {
            character.drawSpecific();
            character.draw();
        }
    }

}
