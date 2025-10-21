package 리스트객체;
// 이름, String
// 가격, int
// 카테고리, String
// 설명, String
// 세금 포함 여부, boolean

// 매개변수가 전부 있는 생성자
// toString 오버라이딩해서 정보 출력 하기

public class MenuInfo {
    private String name;      // 이름
    private int price;        // 가격
    private String category;  // 카테고리
    private String desc;      // 설명
    private boolean isTax;    // 세금 포함 여부

    public MenuInfo(String name, int price, String category, String desc, boolean isTax) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.desc = desc;
        this.isTax = isTax;
    }

    // toString 오버라이딩
    @Override
    public String toString() {
        return  "이름 : " + name + "\n" +
                "     가격 : " + price + "\n" +
                "     카테고리 : " + category + "\n" +
                "     설명 : " + desc + "\n" +
                "     세금 여부 : " + (isTax ? "예" : "아니오") + "\n" +
                "---------------------------------------------------";
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

    public boolean isTax() {
        return isTax;
    }

    public void setTax(boolean tax) {
        isTax = tax;
    }
}
