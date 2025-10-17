package 에어컨실습;

import java.util.Calendar;
import java.util.InputMismatchException;
import java.util.Scanner;
import static java.lang.Thread.sleep;

public class AirCon {
    // 필드 (에어컨의 상태)
    private boolean isPower;
    private int setTemp;
    private int currTemp;
    private boolean isCooler;
    private boolean isHeater;
    private int windStep;

    // 상수 (매직 넘버 제거)
    private static final int TIME_PER_DEGREE_STEP_1 = 60; // 1단은 60초에 1도 변경
    private static final int TIME_PER_DEGREE_STEP_2 = 30; // 2단은 30초에 1도 변경
    private static final int TIME_PER_DEGREE_STEP_3 = 20; // 3단은 20초에 1도 변경

    // 생성자
    public AirCon() {
        final int[] monthArr = {-5, 3, 10, 15, 22, 28, 32, 30, 24, 16, 8, 4};
        Calendar now = Calendar.getInstance();
        int month = now.get(Calendar.MONTH);
        this.currTemp = monthArr[month]; // 현재 월 기준으로 초기 온도 설정
        this.isPower = false;
        this.setTemp = 22; // 기본 설정 온도
        this.isCooler = false;
        this.isHeater = false;
        this.windStep = 1; // 기본 바람 세기
    }

    // 에어컨의 핵심 동작을 책임지는 메서드
    public void operate() {
        int elapsedTime = 0;
        boolean changedTemp = false;

        System.out.println("\n===== 에어컨 작동을 시작합니다. =====");
        airConInfo(); // 초기 상태 출력

        try {
            while (true) {
                sleep(1000); // 1초 대기
                elapsedTime++;

                int timeThreshold = getTimeThreshold(); // 현재 바람 세기에 맞는 시간 임계값 가져오기

                if (elapsedTime >= timeThreshold) {
                    changedTemp = true;
                }

                if (changedTemp) {
                    if (isCooler) setCurrTemp(-1);
                    if (isHeater) setCurrTemp(1);

                    System.out.println("\n[온도 변경!]");
                    airConInfo();
                    elapsedTime = 0;
                    changedTemp = false;
                }

                if (currTemp == setTemp) {
                    System.out.println("\n설정 온도에 도달하여 에어컨 작동을 종료합니다.");
                    break;
                }
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // 예외 처리
        }
    }

    // 현재 바람 세기에 맞는 시간 임계값을 반환하는 도우미 메서드
    private int getTimeThreshold() {
        switch (windStep) {
            case 1: return TIME_PER_DEGREE_STEP_1;
            case 2: return TIME_PER_DEGREE_STEP_2;
            case 3: return TIME_PER_DEGREE_STEP_3;
            default: return TIME_PER_DEGREE_STEP_1; // 기본값
        }
    }

    // 에어컨 정보 출력
    public void airConInfo() {
        final String[] step = {"", "1단계", "2단계", "3단계"};
        System.out.println("=".repeat(10) + " 에어컨 정보 " + "=".repeat(10));
        System.out.println("전원 : " + (isPower ? "ON" : "OFF"));
        System.out.println("현재 온도 : " + currTemp + "℃");
        System.out.println("설정 온도 : " + setTemp + "℃");
        System.out.println("냉방 모드 : " + (isCooler ? "ON" : "OFF"));
        System.out.println("난방 모드 : " + (isHeater ? "ON" : "OFF"));
        System.out.println("바람 세기 : " + step[windStep]);
        System.out.println("=".repeat(32));
    }

    // 에어컨 설정 (Scanner를 인자로 받음)
    public void setAirCon(Scanner sc) {
        System.out.println("현재 온도는 " + currTemp + "℃ 입니다.");

        // 온도 설정 (예외 처리 추가)
        while (true) {
            try {
                System.out.print("온도 설정 : ");
                setSetTemp(sc.nextInt());
                System.out.println("설정 온도는 " + getSetTemp() + "℃ 입니다.");
                break;
            } catch (InputMismatchException e) {
                System.out.println("잘못된 입력입니다. 숫자로만 입력해주세요.");
                sc.next(); // 잘못된 입력을 비워줌
            }
        }

        // 바람 세기 설정 (예외 처리 추가)
        while (true) {
            try {
                System.out.print("바람 세기 설정(1/2/3) : ");
                int step = sc.nextInt();
                if (step > 0 && step < 4) {
                    setWindStep(step);
                    break;
                } else {
                    System.out.println("1, 2, 3 중에서만 선택해주세요.");
                }
            } catch (InputMismatchException e) {
                System.out.println("잘못된 입력입니다. 숫자로만 입력해주세요.");
                sc.next();
            }
        }

        // 현재 온도와 설정 온도에 따라 냉방/난방 모드 자동 설정
        if (currTemp > setTemp) {
            System.out.println("Cooler가 동작합니다.");
            isCooler = true;
            isHeater = false;
        } else if (currTemp < setTemp) {
            System.out.println("Heater가 동작합니다.");
            isCooler = false;
            isHeater = true;
        } else {
            isCooler = false;
            isHeater = false;
        }
    }

    // 게터(Getter)와 세터(Setter)
    public void setPower(boolean power) { this.isPower = power; }
    public void setWindStep(int step) { this.windStep = step; }
    public void setSetTemp(int temp) { this.setTemp = temp; }
    private void setCurrTemp(int n) { this.currTemp += n; }
    public int getSetTemp() { return setTemp; }
}