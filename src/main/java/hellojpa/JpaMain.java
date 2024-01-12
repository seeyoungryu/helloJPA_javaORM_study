package hellojpa;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaMain {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
        EntityManager em = emf.createEntityManager();
        //emf : entityManagerFactory , em: entityManager

        //트랜잭션 시작 (데이터를 변경하는 모든 작업은 트랜잭션 내에서 이뤄져야함)
        EntityTransaction tx = em.getTransaction();
        tx.begin();


        // 실행코드
        //엔티티 관리
        // 여러 Member 객체 생성 및 영속화
        Member member1 = new Member();
        member1.setId(2L);
        member1.setName("HelloB");
        em.persist(member1);

        Member member2 = new Member();
        member2.setId(3L);
        member2.setName("HelloC");
        em.persist(member2);

        Member member3 = new Member();
        member3.setId(4L);
        member3.setName("HelloD");
        em.persist(member3);

        //트랜잭션 커밋
        tx.commit();

        // 닫아주기 (자원 해제)
        em.close();
        emf.close();
        ;
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


//코드는 JPA (Java Persistence API)를 사용하여 `EntityManager` 객체를 생성하는 과정을 나타냅니다.
//
//### EntityManagerFactory
//- `EntityManagerFactory`는 `EntityManager` 인스턴스를 생성하는 공장(factory) 역할을 합니다.
//- `Persistence.createEntityManagerFactory("hello")` 호출은 `hello`라는 이름의 persistence unit(지속성 유닛) 설정에 기반하여 `EntityManagerFactory` 인스턴스를 생성합니다.
//- 이 공장을 통해 필요할 때마다 `EntityManager` 인스턴스를 생성할 수 있습니다.
//
//### EntityManager
//- `EntityManager`는 JPA에서 엔티티를 관리하고 데이터베이스 트랜잭션을 처리하는 핵심 인터페이스입니다.
//- `emf.createEntityManager()` 호출은 `EntityManagerFactory` 인스턴스(`emf`)를 사용하여 `EntityManager` 인스턴스(`em`)를 생성합니다.
//- 생성된 `EntityManager` (`em`)는 데이터베이스에 대한 CRUD (Create, Read, Update, Delete) 작업을 수행하는 데 사용됩니다.
//
//### 요약
//- 코드는 먼저 `EntityManagerFactory` 인스턴스를 생성하고 (`emf`), 이를 통해 `EntityManager` 인스턴스 (`em`)를 생성합니다.
//- `em` 객체는 데이터베이스와의 상호작용을 관리하며, 데이터베이스 작업을 수행하기 위한 주요 인터페이스 역할을 합니다.


//Memer member = new Member();
//em.persist(member);

//이 코드는 JPA를 사용하여 Member 엔티티 객체를 생성하고, 해당 객체를 데이터베이스에 영속화(persist)하는 과정을 나타냅니다.
//
//객체 생성
//Member member = new Member();
//Member 클래스의 새 인스턴스를 생성합니다. 여기서 Member 클래스는 JPA 엔티티로 가정합니다.
// 이 클래스는 데이터베이스의 Member 테이블과 매핑되어 있을 것입니다.

//new Member()는 Member 클래스의 생성자를 호출하여 새로운 객체를 메모리에 할당합니다.
//생성된 객체는 member라는 변수에 할당되어, 이후 코드에서 사용될 수 있습니다.

//객체 영속화
//em.persist(member);
//EntityManager 인스턴스인 em의 persist 메소드를 호출하여, member 객체를 영속 컨텍스트(persistence context)에 추가합니다.
//영속 컨텍스트에 추가된 member 객체는 이후 트랜잭션이 커밋되는 시점에 데이터베이스에 저장됩니다. 이는 객체가 데이터베이스에 영구적으로 저장될 준비가 되었음을 의미합니다.
//persist 메소드는 객체를 데이터베이스에 저장하는 작업을 예약합니다. 실제 데이터베이스에 저장되는 시점은 트랜잭션이 커밋(commit)되는 때입니다.
//요약
//이 코드는 Member 객체를 생성하고, JPA의 영속화 메커니즘을 사용하여 객체를 데이터베이스에 저장하기 위한 준비를 합니다. 이 과정은 JPA를 사용한 데이터의 CRUD(Create, Read, Update, Delete) 작업의 기본이 되며, 데이터베이스와 객체 지향 프로그래밍 사이의 연결고리 역할을 합니다.


//"영속화(Persistence)"라는 용어는 JPA(Java Persistence API)에서 중요한 개념입니다. 영속화는 객체를 데이터베이스에 저장하고 관리하기 위해 JPA가 제공하는 메커니즘을 의미합니다. 이 과정을 통해 객체의 생명주기를 관리하며, 객체와 데이터베이스 간의 상호작용을 쉽게 할 수 있습니다.
//
//### 영속화의 의미와 과정
//- **데이터베이스에 저장:** 영속화된 객체는 데이터베이스에 저장될 준비가 된 상태입니다. `persist()` 메서드를 사용하면, 해당 객체는 JPA의 영속 컨텍스트에 저장됩니다. 이것은 객체가 데이터베이스에 반영될 것임을 예약하는 단계입니다.
//- **트랜잭션과 커밋:** 실제 데이터베이스에 저장되는 시점은 트랜잭션이 커밋(commit)되는 순간입니다. 트랜잭션을 커밋하면, 영속 컨텍스트에 있는 모든 변경 사항(새로 생성된 객체, 변경된 객체 등)이 데이터베이스에 반영됩니다.
//- **영속 상태:** 영속화된 객체는 '영속 상태(persistent state)'에 있습니다. 이 상태에서는 객체가 영속 컨텍스트에 저장되어 있으며, 데이터베이스와 동기화되는 상태를 유지합니다.
//
//### 영속화와 삭제
//- **삭제:** 영속화된 객체를 삭제하려면, `remove()` 메서드를 사용하여 객체를 영속 컨텍스트에서 제거하고 데이터베이스에서도 삭제하도록 예약해야 합니다. 이후 트랜잭션을 커밋하면 데이터베이스에서도 해당 객체가 삭제됩니다.
//
//### 요약
//- 영속화는 객체를 데이터베이스에 저장하는 과정을 간소화하고, 객체와 데이터베이스 간의 동기화를 자동으로 관리합니다.
//- 객체가 영속 상태일 때, JPA는 이를 데이터베이스와 동기화하여 데이터의 무결성과 일관성을 유지합니다.
//- 삭제된 객체는 영속 컨텍스트와 데이터베이스 모두에서 제거됩니다. 따라서 삭제된 후에는 더 이상 영속 상태에 있지 않습니다.


//EntityTransaction tx = em.getTransaction();
// //tx.begin(); //데이터베이스 트랜잭션을 시작함

//제공된 Java 코드는 JPA(Java Persistence API)를 사용하여 데이터베이스 트랜잭션을 시작하는 과정을 나타냅니다. 이 코드의 각 부분을 자세히 살펴보겠습니다:
//
//### EntityTransaction 객체 생성
//- **EntityTransaction tx = em.getTransaction();**
//  - `EntityManager` 인스턴스인 `em`을 통해 `EntityTransaction` 객체를 가져옵니다. 이 객체는 데이터베이스 트랜잭션을 제어하는 데 사용됩니다.
//  - `EntityTransaction` 인터페이스는 트랜잭션과 관련된 작업(시작, 커밋, 롤백 등)을 제공합니다.
//  - 여기서 `tx` 변수는 트랜잭션을 관리하기 위해 사용됩니다.
//
//### 트랜잭션 시작
//- **tx.begin();**
//  - `begin` 메소드를 호출하여 데이터베이스 트랜잭션을 시작합니다.
//  - 이 호출은 후속 데이터베이스 작업들이 하나의 트랜잭션으로 그룹화되도록 합니다. 즉, 이후에 실행되는 모든 JPA 작업들(엔티티의 생성, 조회, 수정, 삭제 등)은 이 트랜잭션의 일부가 됩니다.
//  - 트랜잭션은 모든 데이터베이스 작업이 성공적으로 완료되었을 때 커밋(commit)되거나, 오류가 발생했을 때 롤백(rollback)됩니다.
//
//### 트랜잭션의 중요성
//- 데이터베이스 트랜잭션은 일련의 데이터베이스 작업들을 원자적(Atomic), 일관성(Consistent), 고립(Isolated), 지속적(Durable)으로 처리하기 위해 사용됩니다. 이를 ACID 속성이라고 합니다.
//- 트랜잭션은 데이터의 무결성을 보장하고, 여러 작업을 하나의 단위로 묶어 동시에 성공하거나 실패하도록 합니다.
//- 이러한 특성 덕분에 애플리케이션은 데이터베이스 작업을 더 안전하고 일관되게 처리할 수 있습니다.
//
//결론적으로, 이 코드는 데이터베이스 작업을 안전하게 수행하기 위한 트랜잭션을 시작하는 과정을 나타냅니다.