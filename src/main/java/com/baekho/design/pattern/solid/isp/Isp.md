## 인터페이스 분리 원칙(Interface segregation principle)

- 인터페이스는 그 인터페이스를 사용하는 클라이언트를 기준으로 분리해야 한다.

예를 들어, ArticleWriteService, ArticleListService, ArticleDeleteService가 각각 상위클래스를 가진다면 ArticleService 하나가 아닌 각각의 상위클래스를 가져서 ISP에 부합하는 패턴입니다. 


---

출처: 개발자가 반드시 정복해야 할 객체 지향과 디자인 패턴 - 최범균 저