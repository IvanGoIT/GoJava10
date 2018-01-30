package lessons.lesson8;

public class ThreadExample {

    public static void main(String[] args) {

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                // code execute in thread
                System.out.println("Hello world from new Thread");
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
    }
}
