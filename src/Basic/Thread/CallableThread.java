package Basic.Thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableThread implements Callable<Integer> {
    public static void main(String[] args) {
        CallableThread ctt = new CallableThread();
        FutureTask<Integer> ft = new FutureTask<>(ctt);
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + "A" + i);
            if (i == 20) {
                new Thread(ft, "B").start();
            }
        }
        try {
            System.out.println("B" + ft.get());
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    @Override
    public Integer call() throws Exception {
        int i = 0;
        for (; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
        return i;
    }
}