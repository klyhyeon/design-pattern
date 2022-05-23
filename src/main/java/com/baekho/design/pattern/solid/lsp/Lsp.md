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