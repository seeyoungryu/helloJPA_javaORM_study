package hellojpa;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaMain {

    public static void main(String[] args) {
        EntityManagerFactory emf =  Persistence.createEntityManagerFactory("hello");
        EntityManager em = emf.createEntityManager();
        //emf : entityManagerFactory , em: entityManager

        // 실행코드


        // 닫아주기
        em.close();
        emf.close();;
    }
}


//EntityManager entityManager = entityManagerFactory.createEntityManager();
// 이 코드 라인을 이해하기 위해서는 Java의 객체 지향 프로그래밍 개념과 JPA (Java Persistence API)의 기본 개념을 이해해야 합니다.
//
//객체 지향 프로그래밍에서의 변수 선언과 할당:
//변수 선언: EntityManager entityManager 부분은 EntityManager 타입의 변수 entityManager를 선언합니다.
// 이는 EntityManager 인스턴스를 참조할 수 있는 변수를 만든다는 것을 의미합니다.
//
//객체 생성 및 할당: entityManagerFactory.createEntityManager();는
// EntityManagerFactory 인스턴스인 entityManagerFactory에서 createEntityManager 메소드를 호출하여
// EntityManager 객체를 생성합니다. 그리고 이렇게 생성된 객체는 앞서 선언한 entityManager 변수에 할당됩니다.
//
//JPA (Java Persistence API)에서의 EntityManager:
//EntityManager: JPA에서 EntityManager는 엔티티를 관리하고 데이터베이스 트랜잭션을 처리하는 핵심 인터페이스입니다.
//EntityManager를 통해 데이터베이스에 대한 CRUD (Create, Read, Update, Delete) 작업을 수행할 수 있습니다.
//
//EntityManagerFactory: EntityManagerFactory는 EntityManager 인스턴스를 생성하는 공장(factory) 역할을 합니다.
// 이 공장을 통해 필요할 때마다 EntityManager 인스턴스를 생성할 수 있습니다.
//
//따라서, EntityManager entityManager = entityManagerFactory.createEntityManager(); 코드는
// 새로운 EntityManager 인스턴스를 생성하고 이를 entityManager 변수에 할당하는 과정입니다.
// 이렇게 하여 얻은 entityManager 인스턴스를 사용하여 데이터베이스 작업을 수행할 수 있습니다.


//"인스턴스를 참조한다"는 말은 객체 지향 프로그래밍에서 중요한 개념 중 하나입니다.
// 이 개념을 이해하기 위해서는 먼저 '클래스'와 '인스턴스'라는 용어를 이해해야 합니다.
//
//클래스와 인스턴스
//클래스(Class): 클래스는 객체를 만들기 위한 설계도 또는 틀입니다.
// 예를 들어, '자동차' 클래스에는 바퀴, 엔진, 좌석 등 자동차의 공통적인 특성과 기능이 정의되어 있습니다.
//
//인스턴스(Instance): 인스턴스는 클래스에 정의된 것을 바탕으로 생성된 실제 객체입니다.
// 예를 들어, '현대 소나타' 또는 '기아 K5'는 '자동차' 클래스의 인스턴스로 볼 수 있습니다.
// 이들은 모두 '자동차' 클래스의 특성을 가지고 있지만, 각각 독립적인 실체입니다.
//
//인스턴스 참조
//인스턴스 참조(Reference): 프로그래밍에서 변수가 인스턴스를 '참조'한다는 것은,
// 그 변수가 메모리 상에 존재하는 인스턴스의 위치(주소)를 가리킨다는 의미입니다.
// 이를 통해 해당 인스턴스에 접근하고, 그 인스턴스의 속성이나 메서드(기능)를 사용할 수 있습니다.
//예를 들어, Java에서 EntityManager entityManager = entityManagerFactory.createEntityManager();라는 코드는 다음과 같은 작업을 수행합니다:
//
//entityManagerFactory.createEntityManager();가 EntityManager 타입의 새로운 인스턴스를 생성합니다.
//
//entityManager라는 변수가 이 새로 생성된 EntityManager 인스턴스를 참조하게 됩니다.
// 즉, entityManager는 이 인스턴스의 메모리 주소를 가리키고 있으며, 이를 통해 인스턴스에 접근할 수 있게 됩니다.
//
//간단히 말해서, "인스턴스를 참조한다"는 말은 프로그래밍에서 특정 변수가 메모리 상의 객체(인스턴스)를 가리키고, 그 객체를 사용할 수 있게 된다는 것을 의미합니다.