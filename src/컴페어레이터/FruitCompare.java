package 컴페어레이터;

import java.util.Comparator;

public class FruitCompare implements Comparator<Fruit> {
    @Override
    public int compare(Fruit o1, Fruit o2) {
        if (o1.getPrice() != o2.getPrice()) {
            return o2.getPrice() - o1.getPrice();  // 양수가 나오면 정렬 조건
        }
        return -1;
    }

    @Override
    public Comparator<Fruit> reversed() {
        return Comparator.super.reversed();
    }
}
