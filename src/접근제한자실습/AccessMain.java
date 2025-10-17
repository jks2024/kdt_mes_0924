package 접근제한자실습;

public class AccessMain {
    public static void main(String[] args) {
        Person p1 = new Person("장원영", 22, "서울시", "030101-4111111");
        Student s1 = new Student("안유진", 23, "대전시", "020101-4164414", "천안고");

        System.out.println("이름 : " + p1.name);  // public
        System.out.println("나이 : " + p1.age);   // protected
        System.out.println("주소 : " + p1.addr);  // default

        s1.showInfo();

        System.out.println("이름 : " + s1.name);  // public
        System.out.println("나이 : " + s1.age);   // protected
        System.out.println("주소 : " + s1.addr);  // default
        System.out.println("주민번호 : " + s1.getSsn());

    }
}
