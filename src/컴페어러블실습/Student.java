package 컴페어러블실습;

public class Student implements Comparable<Student>{
    private int id;
    private String name;
    private int kor, eng, mat, sci;

    public Student(int id, String name, int kor, int eng, int mat, int sci) {
        this.id = id;
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.mat = mat;
        this.sci = sci;
    }
    // 총점 만들기
    public int getTotal() {
        return kor + eng + mat + sci;
    }
    // 평균 만들기
    public double getAvg() {
        return getTotal() / 4.0;
    }

    @Override
    public int compareTo(Student o) {
        // 총점 내림차순
        if (this.getTotal() != o.getTotal()) {
            return o.getTotal() - this.getTotal();  // 결과가 양수이면 정렬 조건
        }

        // 총점이 같으면 학번 오름 차순
        return this.id - o.id;  // 결과가 양수이면 정렬 조건
    }

    @Override
    // 출력 형태는 학번, 이름, 총점, 평균으로 출력
    public String toString() {
        return String.format("%d %s 총점: %d 평균: %.2f", id, name, getTotal(), getAvg());
    }
}
