package interview.classloader.testextend;

/**
 * Created by Administrator on 2016/10/28.
 */
public class Parent {
    public static int parent;

    static {
        System.out.println("This is Parent");
    }
}
