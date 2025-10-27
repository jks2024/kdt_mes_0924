package 예외처리3;

import java.io.IOException;

public class Exception3Main {
    public static void main(String[] args) throws IOException {
        IOSample sample = new IOSample();
        sample.input();

    }
}

class IOSample {
    private int num;

    public void input() throws IOException {
        num = System.in.read();
    }
    public void output() {
        System.out.println(num);
    }

}
