package lessons.lesson8;

public class ThreadMethodExample {

    static Thread showTimer(int timer) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                int seconds = 0;
                while(seconds < timer) {
                    try {
                        Thread.sleep(1000);
                        System.out.println(Thread.currentThread().getName() + "   " + ++seconds);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                        break;
                    }
                }
            }
        });
        thread.start();
        return thread;
    }

    public static void main(String[] args) throws InterruptedException {

        showTimer(2).join();
        showTimer(4).join();
        showTimer(10).join();

        for(int i = 0; i < 3; i++) {
            int fi = i;
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println("i = " + fi);
                }
            }).start();
        }
    }
}
