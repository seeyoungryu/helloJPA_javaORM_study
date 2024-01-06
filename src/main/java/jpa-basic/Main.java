package jpa-basic;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}


////Java Persistence API
//
//Java Persistence API (JPA) 설정 파일인 persistence.xml은 프로젝트의 클래스 경로 내에 위치해야 합니다.
// 일반적으로 이 파일은 /META-INF/persistence.xml 경로에 위치해야 합니다.

//
//resources 폴더는 Maven 또는 Gradle과 같은 빌드 도구를 사용하는 Java 프로젝트에서 클래스 경로의 일부로 자동으로 인식되는 폴더입니다.
// 따라서, persistence.xml 파일을 resources 폴더 내에 META-INF라는 폴더를 생성하고 그 안에 위치시키면 적절하게 설정된 것입니다.
//

//
//    Java Persistence API (JPA)는 Java EE (Enterprise Edition) 플랫폼의 일부로, 관계형 데이터베이스의 데이터를 객체로 관리하는 것을 도와주는 API입니다.
//    JPA는 객체-관계 매핑 (Object-Relational Mapping, ORM) 기술을 사용하여 자바 객체와 데이터베이스 테이블 간의 매핑을 쉽게 해줍니다.
//    이 과정에서 "영속성(persistence)"이라는 개념이 핵심적인 역할을 합니다.
//
//        영속성이란 데이터가 프로그램이 종료된 후에도 사라지지 않고 지속되는 성질을 의미합니다.
//        즉, 데이터베이스에 저장된 데이터는 애플리케이션이 종료되어도 남아있어야 합니다. 이러한 데이터의 영속성을 관리하는 것이 JPA의 주요 목적 중 하나입니다.
//
//        **영속성 컨텍스트(Persistence Context)**는 JPA에서 매우 중요한 개념입니다.
//        영속성 컨텍스트는 엔티티(entity)들을 저장하는 환경으로, JPA가 제공하는 영속성 관리의 핵심입니다.
//        엔티티 매니저(Entity Manager)를 통해 엔티티를 영속성 컨텍스트에 저장하고 관리합니다.
//
//        영속성 컨텍스트의 주요 기능은 다음과 같습니다:
//
//        1차 캐시(First Level Cache): 영속성 컨텍스트는 조회된 엔티티 객체들을 캐시하여, 같은 트랜잭션 내에서의 반복된 조회에서 데이터베이스 접근을 줄여 성능을 향상시킵니다.
//
//        엔티티 생명주기 관리: 영속성 컨텍스트는 엔티티의 생명주기 상태(비영속, 영속, 준영속, 삭제)를 관리합니다.
//
//        변경 감지(Dirty Checking): 영속 상태의 엔티티가 변경될 경우, 이러한 변경을 자동으로 감지하고 데이터베이스에 반영합니다.
//
//        지연 로딩(Lazy Loading): 엔티티의 연관된 객체를 즉시 로딩하지 않고, 해당 객체가 실제로 필요할 때 로딩하여 성능을 최적화합니다.
//
//        JPA를 사용하면 복잡한 SQL 쿼리 없이도 객체 지향적인 방식으로 데이터를 쉽게 관리할 수 있으며, 이를 통해 개발자는 비즈니스 로직에 더 집중할 수 있습니다.



//    데이터베이스 방언 Dialect - hibernate.dialect 속성에 지정
//    JPA는 특정 데이터베이스에 종속 X
//        각각의 데이터베이스가 제공하는 SQL 문법과 함수는 조금씩 다름
//        가변 문자: MySQL은 VARCHAR, Oracle은 VARCHAR2 문자열을 자르는 함수: SQL 표준은 SUBSTRING(), Oracle은
//        SUBSTR()
//        • 페이징: MySQL은 LIMIT , Oracle은 ROWNUM
//        방언: SQL 표준을 지키지 않는 특정 데이터베이스만의 고유한 기능


