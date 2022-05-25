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
            missile.drawSpecific();
        } else {
            //OCP를 충족시키도록 drawSpecific() 메서드를 상위 인터페이스에 추가해주었다.
            character.drawSpecific();
            character.draw();
        }
    }

}
