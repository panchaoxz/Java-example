package interview.classloader;

import java.util.Random;

class FinalTest1{
    public static final int a = 6;
    static {
        System.out.println("FinalTest1");
    }
}
class FinalTest2{
    public static final int a = new Random().nextInt(100);
    static {
        System.out.println("FinalTest2");
    }
}
public class TestCompileConstant {
    public static void main(String[] args) {
        System.out.println(FinalTest1.a);
        System.out.println(FinalTest2.a);
    }
}
