package 제니릭응용;

import java.util.Scanner;

public class GenericEx2Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DeviceController<Device> controller = new DeviceController<>();
        System.out.print("기기 선택 [1]프린터 [2]모니터 [3]키보드 : ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1: controller.setDevice(new Printer()); break;
            case 2: controller.setDevice(new Monitor()); break;
            case 3: controller.setDevice(new KeyBoard()); break;
            default: System.out.println("잘못된 입력 입니다."); return;
        }



        System.out.println("=".repeat(30));
        controller.powerOn();
        controller.powerOff();
    }
}
