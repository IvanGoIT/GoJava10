package lessons.lesson4;

public class Method2Example {

    static int x = 100; // создали глобальную переменную

    static void printHello() {
        x = 999;    // пишем в глобальную переменную
    }

    public static void main(String[] args) {
        x = 99;     // создали глобальную переменную

        float x = 0;// создали локальную переменную
        x = 100;    // пишем в локальную переменную

        printHello();

        MethodExample.printArray(new int[]{1, 2, 3});
    }
}
