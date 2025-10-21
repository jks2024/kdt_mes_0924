package 리스트객체;

import java.util.*;

public class ListObjectMain {
    // ArrayList 생성
    private static final List<MenuInfo> list = new Vector<>();  // 클래스 필드
    private static final Scanner sc = new Scanner(System.in);      // 클래스 필드
    public static void main(String[] args) {
        initMenu();
        while (true) {
            System.out.println("[1]조회 [2]등록 [3]수정 [4]삭제 [5]검색 [6]종료 :  ");
            System.out.print("메뉴 선택 : ");
            int sel = sc.nextInt();
            sc.nextLine();
            switch (sel) {
                case 1:
                    menuList();
                    break;  // 메뉴 전체 조회
                case 2:
                    createMenu();
                    break; // 메뉴 등록
                case 3:
                    updateMenu();
                    break; // 메뉴 수정
                case 4:
                    deleteMenu();
                    break; // 메뉴 삭제
                case 5:
                    searchMenu();
                    break; // 메뉴 검색
                case 6:
                    System.out.println("메뉴를 종료 합니다.");
                    return;
            }
        }

    }

    // 초기 메뉴 5개 추가
    private static void initMenu() {  // 클래스 메서드
        list.add(new MenuInfo("아메리카노", 2000, "음료", "기본 커피", true));
        list.add(new MenuInfo("라떼", 4000, "음료", "우유 커피", true));
        list.add(new MenuInfo("홍차", 4000, "차", "홍차 입니다.", false));
        list.add(new MenuInfo("바게트", 5000, "빵", "빵 입니다.", true));
        list.add(new MenuInfo("모카", 5000, "음료", "달달한 커피", true));
    }

    private static MenuInfo createItem() {
        System.out.print("이름 : ");
        String name = sc.nextLine();  // 메뉴 이름
        System.out.print("가격 : ");
        int price = sc.nextInt();
        sc.nextLine();
        System.out.print("카테고리 : ");
        String category = sc.nextLine();
        System.out.print("설명 : ");
        String desc = sc.nextLine();
        System.out.print("[1]세금 포함 [2]세금 별도 : ");
        boolean isTax = (sc.nextInt()  == 1) ? true : false;

        return new MenuInfo(name, price, category, desc, isTax);
    }

    // 메뉴 조회
    private static void menuList() {
        int idx = 0; // 인덱스 번호를 주기 위해서 변수 생성
        for (MenuInfo e : list) {
            System.out.println("[" + ++idx + "] " + e);  // 선 증가 후 대입
        }
    }

    // 메뉴 등록
    private static void createMenu() {
        System.out.println("새 메뉴를 등록 하세요 : ");
        list.add(createItem());
        System.out.println("신규 메뉴가 추가 되었습니다.");
    }

    // 메뉴 수정
    private static void updateMenu() {
        menuList();
        System.out.print("수정 할 번호를 입력 하세요 : ");
        int idx = sc.nextInt() - 1;
        sc.nextLine();
        if (idx < 0 || idx >= list.size()) {
            System.out.println("잘못된 메뉴 번호 입니다.");
            return;
        }
        MenuInfo menuInfo = createItem();
        list.set(idx, menuInfo);
        menuList();
    }

    // 메뉴 삭제
    private static void deleteMenu() {
        menuList();
        System.out.print("삭제할 번호를 입력 하세요 : ");
        int idx = sc.nextInt() - 1;
        if (idx < 0 || idx >= list.size()) {
            System.out.println("잘못된 메뉴 번호 입니다.");
            return;
        }
        list.remove(idx);
        menuList();
    }

    // 메뉴 검색
    private static void searchMenu() {
        System.out.print(("메뉴 검색 하기 : "));
        String searchName = sc.nextLine();
        for (MenuInfo e : list) {
            if (e.getName().contains(searchName)) {
                System.out.println(e);
            }
        }
    }
}
