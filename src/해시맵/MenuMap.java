package 해시맵;
// 메뉴 이름, 가격, 분류, 설명
// 매개변수가 전부 있는 생성자 추가
// 게터, 세터 추가
// toString 오버라이딩
public class MenuMap {
    private String name;
    private int price;
    private String category;
    private String desc;

    public MenuMap(String name, int price, String category, String desc) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.desc = desc;
    }

    @Override
    public String toString() {
        return  "메뉴: " + name + "\n" +
                "가격: " + price + "\n" +
                "카테고리: " + category + "\n" +
                "설명: " + desc + "\n" +
                "--------------------------";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
