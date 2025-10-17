package 날짜와시간;
// Date 클래스 : JDK 1.0에서 도입된 가장 오랜된 방, 내부적으로 long 타입으로 저장되며, 시간 계산에 직접 사용하기 어려움 (비권장 처리)
// Calendar 클래스 : JDK 1.1에 도입, 멀티쓰레드 환경에서 안정적이지 못
// java.time 패키지에 있는 클래스 사용 권장 : LocalDate, LocalTime, LocalDateTime, ZonedDateTime(시간대)
import java.time.*;
import java.time.format.DateTimeFormatter;

public class TimeMain {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();   // 운영체제로 부터 현재 날짜를 가져 옴
        LocalTime time = LocalTime.now();   // 현재 시간을 가져 옴
        LocalDateTime dateTime = LocalDateTime.now(); // 날짜와 시간을 가져 옴
        ZonedDateTime zoned = ZonedDateTime.now();

        // 2025년 10월17일 오전 9시39분38초
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 a hh시 mm분 ss초");
        System.out.println(dateTime.format(formatter));

        // 2025/10/17 AM 09:39:38
        DateTimeFormatter f1 = DateTimeFormatter.ofPattern("yyyy/MM/dd a hh:mm:ss");
        System.out.println(dateTime.format(f1));

        // 2025-10-17 23:45:45  (24시간제로 표시)
        DateTimeFormatter f2 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println(dateTime.format(f2));

        // 25년 10월17일 (금)  => 요일은 E
        DateTimeFormatter f3 = DateTimeFormatter.ofPattern("yy년 MM월dd일 (E)");
        System.out.println(dateTime.format(f3));

        // 날짜 차이 계산
        LocalDate start = LocalDate.of(2024, 1, 1);
        LocalDate end = LocalDate.now();
        Period diff = Period.between(start, end);
        System.out.printf("근무 기간 : %d년 %d월 %d일\n", diff.getYears(), diff.getMonths(), diff.getDays());
    }
}
