package 접근제한자실습;
//- public String name (누구나 접근 가능)
//- protected int age (같은 패키지 + 상속 관계에서만 접근 가능)
//- String addr (default → 같은 패키지에서만 접근 가능)
//- private String ssn (외부에서 직접 접근 불가 → getter 필요)
//- 생성자와 getSsn() 메서드 작성

public class Person {
    public String name;
    protected int age;
    String addr;
    private String ssn;

    public Person(String name, int age, String addr, String ssn) {
        this.name = name;
        this.age = age;
        this.addr = addr;
        this.ssn = ssn;
    }
    // 인스턴스 필드에 대한 접근 가능하도록 Getter 메서드 생성
    public String getSsn() {
        return ssn;
    }
}
