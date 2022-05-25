## 개방 폐쇄 원칙(Open-closed principle)

- 확장에는 열려 있어야 하고, 변경에는 닫혀 있어야 합니다.

풀어 보면 다음과 같습니다.

- 기능을 변경하거나 확장할 수 있으면서
- 그 기능을 사용하는 코드는 수정하지 않는다.

FlowController(사용하는 코드)에서 ByteSource(interface)를 사용한다면, 메모리에서 byte를 읽어 오는 기능을 추가해야 할 때 MemoryByteSource클래스를 구현해서 FlowController의 코드를 수정하지 않고 기능을 추가할 수 있습니다.

즉, 확장되는 부분을 ByteSource로 추상화했기 때문에 확장에는 열려있고 (기능을 사용하는 코드의) 변경에는 닫혀 있다고 표현한 것입니다.


**개방 폐쇄 원칙이 깨질 대의 주요 증상**

추상화와 다형성이 OCP의 주요 특징이기 때문에, 둘이 제대로 지켜지지 않은 코드는 개방 폐쇄 원칙을 어기게 됩니다. 

아래 예제 코드를 보면, `instanceof`를 이용해 계속해서 사용하는 코드를 바꾸게 되면 OCP를 지키지 못하는 것이 됩니다. 따라서 Character 상위 인터페이스를 활용해 추상화를 만들어서 확장엔 개방하고, 코드 변경엔 폐쇄적인 패턴을 만들 수 있었습니다.  

```java
//사용하는 코드
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
```

```java

//추상화를 담당하는 인터페이스
public interface Character {

    void draw();

    void drawSpecific();
}

//Character를 구현하는 클래스들
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

public class Missile implements Character {

    @Override
    public void draw() {

    }

    @Override
    public void drawSpecific() {

    }
}
```

---

출처: 개발자가 반드시 정복해야 할 객체 지향과 디자인 패턴 - 최범균 저