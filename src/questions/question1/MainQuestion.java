package questions.question1;

public class MainQuestion {

    public static void main(String[] args) {
        System.out.println("Урок вопросы-ответы :)");
        sumDemo();
    }

    public static int dollar(int a, int b) {
        return a + b + a / 10 * b;
    }

    public static void sumDemo() {
        System.out.println("2 $ 3 = " + dollar(2, 3)); // dollar(2, 3)
        System.out.println("7 $ 1 = " + dollar(7, 1));
        System.out.println("12 $ 20 = " + dollar(12, 20));
        System.out.println("40 $ 30 = " + dollar(40, 30));
    }
}
