package service;

import java.util.concurrent.Semaphore;

public class Service {

    // permits 代同一时间捏，最多允许多少个线程同时执行acquire()和release()之间的代码
    // 无参方法是使用1个许可
    private Semaphore semaphore = new Semaphore(1);

    public void testMethod() {
        try {
            semaphore.acquire();
            System.out
                    .println(Thread.currentThread().getName() + "begin timer=" + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println(Thread.currentThread().getName() + "end timer=" + System.currentTimeMillis());
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
