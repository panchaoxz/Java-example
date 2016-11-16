package interview.thread.threadtest;

/**
 * Created by Administrator on 2016/11/10.
 */
public class StartThread {
    public static void main(String[] args) {
        interview.thread.synchronizedtest.ThreadA a = new interview.thread.synchronizedtest.ThreadA();
        a.start();
        Thread b = new Thread(new ThreadB());
        b.start();

        new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                System.out.println("thread C : " + i);
            }
        }).start();
    }
}

class ThreadA extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("thread A : " + i);
        }
    }
}

class ThreadB implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("thread B : " + i);
        }
    }
}

