## 리스코프 치환 원칙(Liskov substitution principle)

OCP를 받쳐 주는 다형성에 관한 원칙을 제공합니다. LSP는 다음과 같습니다.

- 상위 타입의 객체를 하위 타입의 객체로 치환해도 상위 타입을 사용하는 프로그램은 정상적으로 작동해야 한다.

```java

public void someMethod(SuperClass sc) {
    sc.someMethod();    
}
```

SuperClass의 someMethod()에 하위 타입의 객체를 전달해도 정상적으로 동작해야 한다는 것이 LSP 입니다.

```java

someMethod( new SubClass() );
```

코드로 예를 들어보면, Coupon 클래스에서 Item을 파라미터로 받아 할인 금액(할인율 * 가격)을 반환하는 메서드가 있습니다. 이 때 구현클래스 할인이 안되는 아이템(NoDiscountItem), 할인이 가능한 아이템(DiscountItem)을 모두 받아줄 수 있을 때 어떤 식으로 LSP를 충족시킬 수 있는지에 대한 패턴입니다.

```java

//실행하는 코드
public class Coupon {

    private final double DISCOUNT_RATE = 0.4;

    public double calculateDiscountPrice(Item item) {

        if (item.isNotDiscountItem()) {
            return 0;
        }
        return item.getPrice() * DISCOUNT_RATE;
    }
}

//추상 인터페이스
public abstract class Item {

    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract boolean isNotDiscountItem();
}

public class DiscountItem extends Item {

    @Override
    public boolean isNotDiscountItem() {
        return false;
    }
}

public class NoDiscountItem extends Item {

    @Override
    public boolean isNotDiscountItem() {
        return true;
    }
}

```


---

출처: 개발자가 반드시 정복해야 할 객체 지향과 디자인 패턴 - 최범균 저