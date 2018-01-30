package lessons.lesson8;

import java.util.Scanner;

public class FixedTimerThreadExample {

    static int x = 2;

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
        }
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Thread thread;

        x = sc.nextInt();
        thread = new Thread(runnable);
        thread.start();

        x = sc.nextInt();
        thread = new Thread(runnable);
        thread.start();

        x = sc.nextInt();
        thread = new Thread(runnable);
        thread.start();
    }
}
