package lessons.lesson8_1;

import java.util.Scanner;

public class SmartVariableExample {

    static String[] book = new String[] {
            "page 0: asfkjfdjsahfjk ahfjksdaf",
            "page 1: s ssssss ahfjksdaf",
            "page 2: asfksdaf",
            "page 3: 22222 ssdsaa ssdaf",
            "page 4: 1273897 12738921739802 1"
    };

    static int countOfPageUpdates = 0;

    public static void main(String[] args) {
        SmartObject<Integer> page = new SmartObject<>();
        // 1 -----------------------------------------------------
        page.getOnUpdate().add(() -> {
            System.out.println(book[page.getValue()]);
        });

        // 2 -----------------------------------------------------
        Runnable runnableAnimation = () -> {
            System.out.println("Запускается анимация перелистывания...");
        };

        // 3 -----------------------------------------------------
        Runnable onFifthUpdate = () -> {
            page.getOnUpdate().remove(runnableAnimation);
            page.setValue(10);
        };

        // 4 -----------------------------------------------------
        Runnable onUpdate = () -> {
            countOfPageUpdates++;
            if (countOfPageUpdates >= 5)
                onFifthUpdate.run();
        };

        page.getOnUpdate().add(runnableAnimation);
        page.getOnUpdate().add(onUpdate);

        Scanner sc = new Scanner(System.in);

        while(true) {
            int userPage = sc.nextInt();
            page.setValue(userPage);
        }
    }
}
