package 해시맵;
// Map key-value 쌍(Pair)으로 데이터를 저장하는 자료 구조
// key는 중복될 수 없고, 값은 중복 가능
// List나 배열처럼 수차적인 접근하지 않고, key를 통해 value를 조회

// 기본 메뉴 3개 추가하는 메서드
// [1]전체 조회 [2]메뉴 검색 [3]메뉴 추가 [4]메뉴 삭제 [5]메뉴 수정 [6]종료
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapMain {
    private final static Map<String, MenuMap> map = new HashMap<>();
    private final static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        initMenu();
        while (true) {
            System.out.println("[1]전체 조회 [2]메뉴 검색 [3]메뉴 추가 [4]메뉴 삭제 [5]메뉴 수정 [6]종료");
            System.out.print("메뉴 선택: ");
            int sel = sc.nextInt();
            switch (sel) {
                case 1: menuList(); break;
                case 2: searchMenu(); break;
                case 3: insertMenu(); break;
                case 4: removeMenu(); break;
                case 5: updateMenu(); break;
                case 6: System.out.println("프로그램을 종료 합니다."); return;
                default: System.out.println("메뉴 선택이 잘 못 되었습니다.");

            }
        }
    }
    // 기본 메뉴 추가하는 메서드 작성
    private static void initMenu() {
        map.put("Americano", new MenuMap("Americano", 2000, "Coffee", "기본커피"));
        map.put("Espresso", new MenuMap("Espresso", 2500, "Coffee", "진한커피"));
        map.put("Latte", new MenuMap("Latte", 4000, "Coffee", "우유 포함"));
    }

    // 전체 메뉴 조회는 키값 기준으로 순회, for(String e : map.keySet())
    private static void menuList() {
        System.out.println("====== 전체 메뉴 보기 ======");
        for(String key: map.keySet()) {
            System.out.println(map.get(key));  // get(key) 키에 대한 값이 반환
        }
    }

    // 메뉴 검색은 map.containsKey()
    private static void searchMenu() {
        System.out.print("조회할 메뉴 입력 : ");
        String key = sc.next();
        if(map.containsKey(key)) {  // map헤 해당 키가 존재하는지 확인
            System.out.println(map.get(key));
        } else System.out.println("해당 메뉴가 존재 하지 않습니다.");
    }

    // 새로운 키와 값을 추가 : map.put(키, 값)
    private static void insertMenu() {
        System.out.print("추가 할 메뉴 입력 : ");
        String key = sc.next();
        if(!map.containsKey(key)) {
            System.out.print("가격 입력: ");
            int price = sc.nextInt();
            System.out.print("카테고리 입력: ");
            String category = sc.next();
            sc.nextLine();
            System.out.print("설명 입력: ");
            String desc = sc.nextLine();
            map.put(key, new MenuMap(key, price, category, desc));
        } else {
            System.out.println("해당 메뉴가 이미 존재 합니다.");
        }
    }

    // 삭제 : map.remove(키)
    private static void removeMenu() {
        System.out.print("삭제할 메뉴를 입력 하세요 : ");
        String key = sc.next();
        if(map.containsKey(key)) {
            map.remove(key); // 키를 입력 받아 entry(key, value)를 삭제
            System.out.println(key + " 메류를 삭제 했습니다.");
        } else {
            System.out.println("삭제할 메뉴가 없습니다.");
        }
    }

    // 수정 : map.replace(키, 값)
    private static void updateMenu() {
        System.out.print("수정할 메뉴를 입력 하세요 : ");
        String key = sc.next();
        if(map.containsKey(key)) {
            System.out.print("가격 입력: ");
            int price = sc.nextInt();
            System.out.print("카테고리 입력: ");
            String category = sc.next();
            sc.nextLine();
            System.out.print("설명 입력: ");
            String desc = sc.nextLine();
            map.replace(key, new MenuMap(key, price, category, desc));
        } else {
            System.out.println("수정 할 메뉴가 없습니다.");
        }
    }
}
