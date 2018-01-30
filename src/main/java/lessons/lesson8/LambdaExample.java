package lessons.lesson8;

public class LambdaExample {
    public static void main(String[] args) {
        Runnable r = () -> System.out.println("i = " + 10);

        Runnable rr = () -> {
            System.out.println(Thread.currentThread().getName() + "  Hello from Lambda");
        };

        rr.run();
        rr.run();
        rr.run();

        new Thread(rr).start();

        ITest tt = () -> {
            System.out.println("bla bla");
        };

        tt.blabla();
    }
}
