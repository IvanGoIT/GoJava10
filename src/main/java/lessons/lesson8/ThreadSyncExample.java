package lessons.lesson8;

import java.util.concurrent.Semaphore;

public class ThreadSyncExample {

    static Semaphore semaphore = new Semaphore(1);

    static void writeDataInDatabase() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() +"   Ожидается семафор");
        semaphore.acquire();
        System.out.println(Thread.currentThread().getName() +"   Cемафор получен");

        // write in database ...
        System.out.println(Thread.currentThread().getName() +"   Writing in database...");
        Thread.sleep(100);

        System.out.println(Thread.currentThread().getName() +"   Освобождается семафор");
        semaphore.release();
        System.out.println(Thread.currentThread().getName() +"   Семафор освобожден");
    }

    public static void main(String[] args) {
        for(int i = 0; i < 10; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        writeDataInDatabase();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
            System.out.println(Thread.currentThread().getName() + "   поток создан - " + i);
        }
    }
}
