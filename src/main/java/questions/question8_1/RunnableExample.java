package questions.question8_1;

import java.io.File;

public class RunnableExample {

    public static void main(String[] args) {

        File file = new File("files/lesson1/lesson1.txt");
        int a = 0;

        for(int i = 0; i < 1; i++) {
            Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    System.out.println("Exists = " + file.exists());
                    System.out.println(a);
                    // a = 0;
                }
            };

            Runnable runnable2 = () -> {
                System.out.println("Exists = " + file.exists());
                System.out.println(a);
                // a = 0;
            };
            runnable.run();
            runnable2.run();
        }
    }
}
