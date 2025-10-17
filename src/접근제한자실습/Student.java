package 접근제한자실습;

// Person 상속
// school 필드 추가 (default 접근 제한)
// 생성자와 getter 작성
// 부모의 age, name에 접근
// showInfo() 작성

public class Student extends Person {
    private String school;
    public Student(String name, int age, String addr, String ssn, String school) {
        super(name, age, addr, ssn);
        this.school = school;
    }
    public String getSchool() {
        return school;
    }

    public void showInfo() {
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("주소 : " + addr);
        System.out.println("주민번호 : " + getSsn());
        System.out.println("학교 : " + school);
    }
}
