package interview.thread.synchronizedtest;

/**
 * Created by Administrator on 2016/11/12.
 */
public class SychronizeTest {
}

class Task {
    public void excute(String threadName) {
        for (int i = 0; i <= 20; i++) {
            System.out.println(threadName + " ------ " + i);
        }
    }
}

class ThreadA extends Thread{

}