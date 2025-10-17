package 상속TV;

public class InheritanceTVMain {
    public static void main(String[] args) {
        ProductTV tv1 = new ProductTV(false, 11, 20, false);
        tv1.setPower(true);
        tv1.setChannel(true, 1200);
        tv1.setVolume(120);
        System.out.println(tv1);
    }
}
