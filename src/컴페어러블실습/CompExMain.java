package 컴페어러블실습;
// 이름, 학번(int), 국어, 영어, 수학, 과학 과목을 필드로 하는  Student 클래스 생성
// Student 클래스 학생 10애 대한 데이터를 입력 받음
// 총점과 평균을 구하기
// 총점이 높은 학생순(내림차순)으로 정렬하고 총점이 같으면 학번순으로 정렬(오름차순)
// 출력 형태는 학번, 이름, 총점, 평균으로 출력

import java.util.*;

public class CompExMain {
    public static void main(String[] args) {
        Set<Student> students = new TreeSet<>();
        //List<Student> students = new ArrayList<>();

        students.add(new Student(100, "안유진", 90, 88, 78, 78));
        students.add(new Student(101, "장원영", 99, 98, 97, 100));
        students.add(new Student(102, "가을", 67, 78, 78, 56));
        students.add(new Student(103, "이서", 90, 99, 78, 84));
        students.add(new Student(104, "레이", 60, 55, 48, 75));

        //Collections.sort(students);

        for (Student e : students) System.out.println(e);
    }
}
