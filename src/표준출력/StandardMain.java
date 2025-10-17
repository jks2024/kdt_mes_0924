package 표준출력;
// 자바의 표준 입출력 클래스 : System
// System.in :  표준 입력 스트림
// System.out : 표준 출력 스트림
// System.out.println(내용)
// System.out.print(내용)
// System.out.printf("서식", 내용)
// System.err : 표준 오류 스트림

// 이스케이프 시퀀스 :\n, \r, \t, \b, \\

// 이름, 전화번호, 주소, 국어, 영어, 수학 성적을 정하고, 평균과 총점을 구해서 출력하기
// 셩별은 문자로 입력 받고 출력은 문자열로 할 예정

public class StandardMain {
    public static void main(String[] args) {
        String name ="곰돌이";
        String addr = "경기도 수원시";
        int kor = 99;
        int eng = 98;
        int mat = 77;
        int total = kor + eng + mat;
        double avg = total / 3.0;
        char gender = 'M';

        // 자바 스타일
        System.out.println("이름 : " + name);
        System.out.println("주소 " + addr);
        System.out.println("총점 : " + total);
        System.out.println("평균 : " + avg);
        System.out.println("성별 : " + ((gender == 'M') ? "남성": "여성"));

        // 서식지정자 스타일 : %
        System.out.printf("이름 : %s\n", name);
        System.out.printf("주소 : %s\n", addr);
        System.out.printf("총점 : %d\n", total);
        System.out.printf("평균 : %.2f\n", avg);


    }
}
