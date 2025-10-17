package TV만들기;

public class TVMain {
    public static void main(String[] args) {
        Television tv1 = new Television(false, 11, 20);
        Television tv2 = new Television();
        Television tv3 = new Television(false);

        System.out.println(tv1);
        System.out.println(tv2);
        System.out.println(tv3);

    }
}
