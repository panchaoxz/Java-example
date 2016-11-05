package interview.classloader;

class SingletonOne {
    private static SingletonOne singletonOne = new SingletonOne();
    public static int counter1;
    public static int counter2 = 0;

    private SingletonOne() {
        counter1++;
        counter2++;
    }

    public static SingletonOne getSingletonOne() {
        return singletonOne;
    }
}

class SingletonTwo {
    public static int counter1;
    public static int counter2;
    private static SingletonTwo singletonTwo = new SingletonTwo();

    private SingletonTwo() {
        counter1++;
        counter2++;
    }

    public static SingletonTwo getSingletonTwo() {
        return singletonTwo;
    }
}

public class TestClassLoaderOrder {
    public static void main(String[] args) {
        SingletonOne singletonOne = SingletonOne.getSingletonOne();
        System.out.println("singletonOne count1 = " + SingletonOne.counter1);
        System.out.println("singletonOne count2 = " + SingletonOne.counter2);

        SingletonTwo singletonTwo = SingletonTwo.getSingletonTwo();
        System.out.println("singletonTwo count1 =" + singletonTwo.counter1);
        System.out.println("singletonTwo count2 =" + singletonTwo.counter2);
    }
}
