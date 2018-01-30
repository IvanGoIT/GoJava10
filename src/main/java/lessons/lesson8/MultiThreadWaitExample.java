package lessons.lesson8;

import java.util.Scanner;

public class MultiThreadWaitExample {
    static int x = 3;

    static Runnable runnable = new Runnable() {
        @Override
        public void run() {
            int seconds = 0;
            while(seconds < x) {
                try {
                    seconds++;
                    Thread.sleep(1000); // спать одну секунду
                    System.out.println(Thread.currentThread().getName() + "  " + seconds);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    break;
                }
            }
            System.out.println(Thread.currentThread().getName() + " поток завершен");
        }
    };

    public static void main(String[] args) throws InterruptedException {
        Thread thread;

        thread = new Thread(runnable);
        thread.start();
        System.out.println("main thread : ожидает завершения таймера");
        thread.join();
        System.out.println("main thread : освободился");

        thread = new Thread(runnable);
        thread.start();
        System.out.println("main thread : ожидает завершения таймера");
        thread.join();
        System.out.println("main thread : освободился");

        thread = new Thread(runnable);
        thread.start();
        System.out.println("main thread : ожидает завершения таймера");
        thread.join();
        System.out.println("main thread : освободился");

        System.out.println("main thread : the end");
    }
}
