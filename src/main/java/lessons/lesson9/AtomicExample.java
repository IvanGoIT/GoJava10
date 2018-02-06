package lessons.lesson9;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class AtomicExample {

    static String[] book = new String[] {
        "page 0: asfkjfdjsahfjk ahfjksdaf",
        "page 1: s ssssss ahfjksdaf",
        "page 2: asfksdaf",
        "page 3: 22222 ssdsaa ssdaf",
        "page 4: 1273897 12738921739802 1"
    };

    static AtomicInteger atomicPage = new AtomicInteger(0);

    static Runnable onUpdate = () -> {
        System.out.println(book[atomicPage.get()]);
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            int page = sc.nextInt();
            atomicPage.set(page);
        }
    }
}
