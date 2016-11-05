package interview.classloader.testextend;

/**
 * Created by Administrator on 2016/10/28.
 */
public class Child extends Parent {
    public static int child;
    static
    {
        System.out.println("This is Child");
    }
}
